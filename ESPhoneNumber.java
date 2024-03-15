
public class ESPhoneNumber implements PhoneNumber {
 private String number;
 
 public ESPhoneNumber(String number) {
     this.number = number;
     
     
 }

@Override
public String getFormattedNumber() {
	// TODO Auto-generated method stub
	return "+34 " + number;
			
}
}
