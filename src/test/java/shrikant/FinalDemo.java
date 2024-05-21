package shrikant;

public  class FinalDemo {
	int x = 10;// we can change the value of x
	final int y = 20;// we cant change the value of y,but it will create multiple copies of y for
						// each object
	// CAN WE CREATE A BLANK FINAL VARIABLE??ANS-YES,but it must be initialized in
	// Block/Static Block/Constructor
	/*final float pi;
	{
		pi = 3.14f;
		System.out.println(pi);
	}*/
	private  final int a=10;

	public   final void finalMethod() {
		System.out.println("This is Parent class method");
		System.out.println(a);
	}

	public   final void finalMethod(String Weight) {
		System.out.println("One arg");
		//return Weight;
	}

	public static int finalMethod(int Weight, int Height) {
		System.out.println("two arg");
		return Weight + Height;
	}

	  public static void main(String[] a) {
		FinalDemo fd = new FinalDemo();
		//fd.finalMethod("58");
		fd.finalMethod();
		fd.main();
		int x=10;
	}
	private final static void main() {
		FinalDemo fd = new FinalDemo();
		//fd.finalMethod("58");
		System.out.println("ashdjsahjk");
		fd.finalMethod();
	
	}

}
