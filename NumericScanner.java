
import java.util.Scanner;

public class NumericScanner {
	
	public static String numberInput;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Get User Input
		System.out.println("Type a number between 50 and 300");
		numberInput = input.nextLine();
		
		//Set local variable equal to returned Integer from set method
		Integer convertInput = setNumericInput();
		
		//Print out result
		System.out.println("The number you typed in was: " + convertInput);
		
		input.close();
	}
	
	public static Integer setNumericInput() {
		
		Integer convertedInput = Integer.parseInt(numberInput);
		
		if (convertedInput >= 50 && convertedInput <= 300) {
			
			return convertedInput;
		}
		
		else {
			
			return null;
		}
	}
}
