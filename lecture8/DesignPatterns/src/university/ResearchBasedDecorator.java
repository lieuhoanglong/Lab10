package university;

public class ResearchBasedDecorator extends FeeDecorator {

	public ResearchBasedDecorator(Student student) {
		super(student);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double fee() {
		// TODO Auto-generated method stub
		return super.fee() + 3000;
	}
}
