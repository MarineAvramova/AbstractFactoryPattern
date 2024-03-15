
public interface ContactBookFactory {
PhoneNumber createPhoneNumber(String number);
Address createAddress(String street, String city, String state, String zipCode);
}
