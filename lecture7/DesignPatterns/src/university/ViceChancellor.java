package university;

public class ViceChancellor extends Staff {
	private static ViceChancellor uniqueVC;
	private ViceChancellor(String ID, String name) {
		super(ID, name);
		// TODO Auto-generated constructor stub
	}

	public static ViceChancellor getVC() {
		if (uniqueVC == null) {
			uniqueVC = new ViceChancellor("00001", "Mr VC");
		}
		return uniqueVC;
	}
}
