package wk3lab3;
import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double annualInterestRate;
		int numberOfYears;
		double loanAmount;
		
		
		
		System.out.println("Enter annual interest rate, for example, 8.25: ");
		annualInterestRate = input.nextDouble();
		
		System.out.println("Enter number of years as an integer: ");
		numberOfYears = input.nextInt();
		
		System.out.println("Enter loan amount, for example, 120000.95: ");
		loanAmount = input.nextDouble();
		
		Loan newLoan = new Loan(annualInterestRate,numberOfYears,loanAmount);

		System.out.println("The loan was created on " + newLoan.getLoanDate());
		System.out.printf("The monthly payment is %.2f \n", newLoan.getMonthlyPayment());
		System.out.printf("The total payment is %.2f \n", newLoan.getTotalPayment());
	}
}
