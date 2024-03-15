import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    try {
	        System.out.println("Enter the country code ('USA' or 'ES'): ");
	        String userCountryCode = scanner.nextLine();

	        ContactBookFactory selectedFactory = getFactoryByCountryCode(userCountryCode);

	        PhoneNumber phoneNumber;
	        Address address;

	        
	        if ("USA".equals(userCountryCode)) {
	            phoneNumber = selectedFactory.createPhoneNumber("2123620507");
	            address = selectedFactory.createAddress("88 Central Park W", "New York", "NY", "10023");
	        } else if ("ES".equals(userCountryCode)) {
	            phoneNumber = selectedFactory.createPhoneNumber("9865784");
	            address = selectedFactory.createAddress("Carrer de Argentina 43", "Barcelona", "Catalunya", "08004");
	        } else {
	           
	            throw new IllegalArgumentException("Unsupported country code: " + userCountryCode);
	        }

	        System.out.println(phoneNumber.getFormattedNumber());
	        System.out.println(address.getFormattedAddress());
	    } finally {
	        scanner.close();
	    }
    }

    private static ContactBookFactory getFactoryByCountryCode(String countryCode) {
        switch (countryCode) {
            case "USA":
                return new USAContactFactory();
            case "ES":
                return new ESContactFactory();
            default:
                throw new IllegalArgumentException("Unsupported country code: " + countryCode);
        }
	 }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
