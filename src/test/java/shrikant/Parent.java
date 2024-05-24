package shrikant;

  public class Parent {
	 private static final  int x;
	static String name;
	static{
		x=10000;
		System.out.println(x);
		System.out.println(name);
	}
		
	 Parent() {
		System.out.println("I private constructor");
	}
	
	
	 static void addition() {
System.out.println("parent");
	}
	 static void addition(int x) {
		 System.out.println("parent");
		 	}

 public  static void main(String[] args) {
		
		//Child c=new Child();

	}

}
