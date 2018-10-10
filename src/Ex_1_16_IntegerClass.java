/**
 * 
 */

/**
 * @author ik013043z1
 *
 */import java.util.Scanner;

 	import java.lang.Integer;

public class Ex_1_16_IntegerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		int number1;
		int number2;
		
		int result;
		
		System.out.println("Enter two number to know if they are the same");
		
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		
		//Integer num1 = new Integer(number1); THIS IS THE OLD WAY DONT USE IT
		Integer num1 = number1;
		//Integer num2 = number2; We only need an object to use the method num1 not both.
		
		/*compareTo()
		 * This command compares two Integer an returns -1,0,1 depending on it
		 * In this case, we have converted the first number (num1) into an object to use 
		 * the method with it it
		 */
		result = num1.compareTo(number2);
	
		switch (result){
			
			case -1:
				
				System.out.println(number1+ " is smaller than "+number2);
				break;
				
			case 1:
				
				System.out.println(number1+ " is smaller than "+number2);
				break;
			case 0:
				
				System.out.println(number1+ " is the bigger as "+number2);
				break;
			
		}
		
		
		/* getInteger()
		 * 
		 * 
		 */
		System.out.println("Enter numbers:");
		
		String sentence;
		int abc = 5;
		
		sentence = scan.nextLine();
		sentence = scan.nextLine();
		
		System.out.println(num1.getInteger(sentence));
		
		
		
	}

	

	}
