import java.util.Scanner ;
public class IT1 {

// method to calculate summation
public static int addition (int num1 , int num2) {

	return num1 + num2 ;
 
}

// method to calculate subtraction
public static int subtraction (int num1, int num2) {

	return num1 - num2 ;

}

// method to calculate multiplication
public static int multiplication (int num1, int num2) {

	return num1 * num2 ;

}

// method to calculate division
public static int division (int num1, int num2) {

	if (num2 == 0) {
	
		System.out.println ("Division by zero is Invalid !");
		return 0;
	}
		
		return num1 / num2;
		
}


public static void main (String...args) {

	Scanner sc = new Scanner (System.in);
	
	char continueCalculation; // variable to perform loop

	System.out.println ();
	System.out.println ("This program has been developed as a calculator using two integers!");
	
	// do-while loop ,to perform the program until user say no
	do {
		System.out.println ("Enter two integers : " );
		int input1 = sc.nextInt ();
		int input2 = sc.nextInt ();
	
		System.out.print ("choose a operator to calculate ( + , / , * , - ) : ");
		char input3 = sc.next().charAt(0);
		
		int result = 0 ;	
		boolean validOperator = true;
		
		switch (input3)

		{

			case '+' :
					result = addition (input1,input2);
					break;

			case '-' :
					result = subtraction (input1,input2);
					break;

			case '*' :
					result = multiplication (input1,input2);
					break;


			case '/' :
					result = division (input1,input2);
					break;

			default : 
					System.out.println ("Ooops invalid input!");

		
		}

		if (validOperator) {

			System.out.print ("Result is : " +result);
			System.out.println ();

		}
		
		System.out.print ("Do you want to continue using this program type (y/n)  : " );
		continueCalculation = sc.next().charAt(0);
		
		} while (continueCalculation == 'y' || continueCalculation == 'Y');

		System.out.println ("Thank you for using our calculator!");

		


 }
}
