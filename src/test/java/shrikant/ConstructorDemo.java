package shrikant;

public class ConstructorDemo extends ParentConstructorDemo {
	//1.0 It is used to initilaize the object of class
	//2.0 Constructor will give value to noninitliaze variable for ex x==0 and name=null
	//3.0 Constructor is injected at the time of class compilation,if not written by programmer,then compiler will cal default constructor
	//4.0 constructor is special type of method which donsent have any return value
	//5.0 Constructor name is same as Class name\
	//notes:-1 NoT ALLOWED- Final ,Static,Abstract access modifiers
	//Before creating Object 2 events are happening 1)Static/Instance block 2)Constructor 
	//Constructor can be overloaded but not overrided as Constructor name is same as Class name and Overrided is related with parent and child class ,their name must diff
	//we can make constructor as private TO STOP INHERITANCE
	int x;
	String name;
	static {
		System.out.println("I am Static Block");
	}
	{
		System.out.println("I am Instance Block");
	}
   ConstructorDemo()//Illegal modifier; only public, protected & private are permitted
	{
		System.out.println("This is Devloper Constructor");
		System.out.println(x);
		System.out.println(name);
	}
   ConstructorDemo(String msg)//Illegal modifier; only public, protected & private are permitted
  	{
  		System.out.println("This is Overladed Constructor Constructor");
  		System.out.println(msg);
  		
  	}

	public static void main(String[] args) {
		ConstructorDemo cd= new ConstructorDemo("Hello i am overloded");
	}

}
