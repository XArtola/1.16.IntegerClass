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
		
		System.out.println("Enter two number to know if they are the same\n");
		
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
				
				System.out.println(number1+ " is equal to "+number2);
				break;
			
		}
		
		
		/* getInteger()
		 *  This command determines the integer value of the system property with the specified name.
		 * In this case we can know the version of the JRE installed 32/64 bits
		 */
		
		System.out.println("Enter numbers:\n");
		
		String sentence = "sun.arch.data.model";
		
		System.out.println(Integer.getInteger(sentence));
		
		/* intValue()
		 * Returns to an int the value of an integer object
		 */
		
		number1 = num1.intValue();
		
		System.out.println(number1);
		
		/* parseInt()
		 * This command convert a string value into an int
		 */
		
		int number3;
		
		scan.nextLine();
		
		System.out.println("Enter numbers\n");
		
		sentence = scan.nextLine();
		
		number3 = Integer.parseInt(sentence);
		
		System.out.println(number3);
		
		/* shortValue()
		 * This command returns the value of a Short type object to a short variable
		 */
		
		short number4;
		
		System.out.println("Enter a short number:\n");
		
		Short shor = scan.nextShort();
		
		number4 = shor.shortValue();
		
		System.out.println(number4);
		
		/* toString()
		 * This command converts the value of an object into a string
		 */
		
		String sentence2;
		
		sentence = num1.toString();
		sentence2 = shor.toString();
		
		System.out.println("The string value of the Integer object is: "+sentence+
				"\n"+ "The string value of of the Short object is: " +sentence2);
		
		
		/* valueOf()
		 * This command takes the value of an object into another
		 */
		
		Integer num2 = num1.valueOf(number4);
		Integer num3 = Integer.valueOf(5);
		
		System.out.println(num2+"and"+num3);
		
	}

	

	}
