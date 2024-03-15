
public class USAPhoneNumber implements PhoneNumber {
	 private String number;
	 
	 public USAPhoneNumber(String number) {
	        this.number = number;
	    }


	@Override
	public String getFormattedNumber() {
		
		return "+1 " + number;
	}

}

