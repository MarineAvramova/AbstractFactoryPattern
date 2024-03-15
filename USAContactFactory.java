
public class USAContactFactory implements ContactBookFactory {

	@Override
	public PhoneNumber createPhoneNumber(String number) {
		
		return new USAPhoneNumber(number);
	}

	@Override
	public Address createAddress(String street,  String city, String state, String zipCode) {
		// TODO Auto-generated method stub
		return new USAAddress(street, city, state, zipCode);
	}

	
}
