package university;

public abstract class FeeDecorator implements Student {
	private Student student;
	
	public FeeDecorator(Student student) {
        this.student = student;
    }
	
	@Override
	public double fee() {
		// TODO Auto-generated method stub
		return student.fee();
	}

}
