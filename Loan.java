package wk3lab3;

//import java.util.Date;

public class Loan {
	double annualInterestRate;
	int numberOfYears;
	double loanAmount;
	java.util.Date loanDate;

	public Loan() {

	}

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public java.util.Date getLoanDate() {
		loanDate = new java.util.Date();
		return loanDate;
	}

	public void setLoanDate(java.util.Date loanDate) {
		this.loanDate = loanDate;
	}

	public double getMonthlyPayment() {
		double monthlyPayment;
		double monthlyInterestRate = annualInterestRate / 1200;

		monthlyPayment = (loanAmount * monthlyInterestRate)
				/ (1 - (1 / Math.pow((1 + monthlyInterestRate), (numberOfYears * 12))));

		return monthlyPayment;
	}

	public double getTotalPayment() {
		double totalPayment;

		totalPayment = getMonthlyPayment() * numberOfYears * 12;

		return totalPayment;
	}


		

	
}
