package shrikant;

public class KailashInterviewQOnException {
	int x;

	public static void main(String[] args) {
		System.out.println(KailashInterviewQOnException.test());
	}

	public static int test() {
		try {
			System.out.println("I am try block");
			return 1;
		} catch (Exception e)// in catch block Exception was not written ,we have to write Exception e
		{
			return 2;
		} finally {
			return 3;
			// we can write variable after return line
			// System.out.println("finally trumps return.");//This will be unreachble code
			// as wrritten after return line
		}
//if all 2 problems solved then it will return 3 not 1 becasue it will be overrided beacuse only one value will return for one method
	}

}
