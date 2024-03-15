
public class ESAddress implements Address {
private String street;
private String city;
private String state;
private String zipCode;
    
    public ESAddress(String street, String city, String state, String zipCode) {
    	this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

	@Override
	public String getFormattedAddress() {
		// TODO Auto-generated method stub
		return street + ", " + city + ", " + state + " " + zipCode + ", Spain";
    }
	}

	
    

