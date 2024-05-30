package Com.Ajit;

public class SingleDigitNumber {
	public static void main(String[] args) {
		int num = 758785555;
		int rem;
		int sum =0;
		
		
		while ( num!=0) {
			rem = num %10; 
			sum = sum+rem; 
			num = num/10; 
			
			
		}
		System.out.println("Sum of all digits  :" + sum);		
		if (sum>10) {
			rem = sum %10;
			sum = sum/10 + rem;
			System.out.println("Sum of two digit :" +sum);	
		}
		if (sum>=10) {
			rem = sum %10;
			sum = sum/10 + rem;
			System.out.println("Sum of two digit :" +sum);
		}
	}

}
