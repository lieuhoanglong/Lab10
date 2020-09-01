package credit;

public class CreditCheckOffline extends CreditCheck {

	public CreditCheckOffline() {
		super();
	}

	@Override
	public double creditLimit(int id) {
		// TODO Auto-generated method stub
		// Do a bunch of credit check questions online
		if (id==0)
			return 2000;
		return 4000;
	}

}
