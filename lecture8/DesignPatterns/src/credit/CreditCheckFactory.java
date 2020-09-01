package credit;

public class CreditCheckFactory {

	public CreditCheckFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static CreditCheck createCreditCheck(boolean online) {
		if (online)	return new CreditCheckOnline();
		return new CreditCheckOffline();
	}

}
