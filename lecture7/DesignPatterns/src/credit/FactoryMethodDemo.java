package credit;
import java.util.Scanner;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		// ask system if the credit check is offline or not
		boolean online = false;
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Is system online? ");
	    online = myObj.nextLine().contains("Y");
	    
	    
		CreditCheck cc = CreditCheckFactory.createCreditCheck(online);
		// now use cc to perform credit check without worrying that if it is online or offline
		System.out.println("Credit limit is: " + cc.creditLimit(0));
		return;
	}

}
