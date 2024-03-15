
public class ESContactFactory implements ContactBookFactory {

	@Override
	public PhoneNumber createPhoneNumber(String number) {
		// TODO Auto-generated method stub
		return new ESPhoneNumber(number);
	}

	@Override
	public Address createAddress(String street, String city, String state, String zipCode) {
		// TODO Auto-generated method stub
		return new ESAddress(street, city, state, zipCode);
	}

	
}
