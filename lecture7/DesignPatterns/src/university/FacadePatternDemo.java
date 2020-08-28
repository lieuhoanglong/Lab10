package university;

public class FacadePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentFeeRetriever feeRetriever = new StudentFeeRetriever();
		System.out.println(feeRetriever.getPartTimeFee());
		System.out.println(feeRetriever.getFullTimeFee());
	}

}
