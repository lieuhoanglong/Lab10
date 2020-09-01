package credit;

public class CreditCheckOnline extends CreditCheck {

	public CreditCheckOnline() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public double creditLimit(int id) {
		// TODO Auto-generated method stub
		// Do a bunch of credit check questions online
		if (id==0)	return 500;
		return 1000;
	}

}
