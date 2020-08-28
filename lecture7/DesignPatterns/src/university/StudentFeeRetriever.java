package university;

public class StudentFeeRetriever {
	private Student parttimer;
	private Student fulltimer;
	
	public StudentFeeRetriever() {
		parttimer = new PartTimeStudent();
		fulltimer = new FullTimeStudent();
	}
	
	public double getPartTimeFee() {
		return parttimer.fee();
	}
	
	public double getFullTimeFee() {
		return fulltimer.fee();
	}
}
