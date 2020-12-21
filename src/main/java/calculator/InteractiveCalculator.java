package calculator;

import java.util.Scanner;

import operations.AddOperation;
import operations.DivideOperation;
import operations.MultiplyOperation;
import operations.SubtractOperation;

public class InteractiveCalculator {
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			
			while(true) {
				System.out.print("Enter first number: ");
				int numberA = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter second number: ");
				int numberB = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Type of operation (add,subtract,multiply,divide): ");
				String operation = scanner.nextLine().toLowerCase();
				
				int result = 0;
				if(operation.equals("add")) {
					AddOperation add = new AddOperation();
					add.setA(numberA);
					add.setB(numberB);
					result =add.getResult();
					System.out.println(result);
					
				}else if(operation.equals("subtract")) {
					SubtractOperation subt = new SubtractOperation();
					subt.setA(numberA);
					subt.setB(numberB);
					result = subt.getResult();
					System.out.println(result);
					
				}else if(operation.equals("multiply")) {
					MultiplyOperation mult = new MultiplyOperation();
					mult.setA(numberA);
					mult.setB(numberB);
					result = mult.getResult();
					System.out.println(result);
					
				}else if(operation.equals("divide")) {
					DivideOperation div = new DivideOperation();
					div.setA(numberA);
					div.setB(numberB);
					double fResult = div.getResult();
					System.out.printf("%.2f\n",fResult);
				}
				
				System.out.println("Do it again? Enter anything for yes or no to exit: ");
				String answer = scanner.nextLine();
				if(answer.equalsIgnoreCase("no")) {
					break;
				}
			}

	}

}
