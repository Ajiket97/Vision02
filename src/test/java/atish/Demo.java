package atish;


public class Demo {
	 int i=10;
		
		public static void main(String[] args) {
		
			Demo t1= new Demo();
			Demo t2= new Demo();
			Demo t3= new Demo();
			
			t1.i= t1.i+5;
			t2.i=t1.i+10;
			
			
			
			
			System.out.println(t1.i);
			System.out.println(t2.i);
			System.out.println(t3.i);
		
		}
}
