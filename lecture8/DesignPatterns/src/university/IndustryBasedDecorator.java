package university;

public class IndustryBasedDecorator extends FeeDecorator {

	public IndustryBasedDecorator(Student student) {
		super(student);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double fee() {
		// TODO Auto-generated method stub
		return super.fee() + 1000;
	}
}
