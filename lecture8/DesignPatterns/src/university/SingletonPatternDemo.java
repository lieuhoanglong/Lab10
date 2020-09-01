package university;

public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff myVC = ViceChancellor.getVC();
		System.out.println("MY VC is: " + myVC.getName());
		ViceChancellor myVC2 = ViceChancellor.getVC();
		System.out.println("MY VC2 is: " + myVC.getName());
	}

}
