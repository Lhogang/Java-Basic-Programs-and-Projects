package emi;
import java.util.Scanner;

class Loan {
     double principal;
    double interestRate;
    int tenure;

    public Loan(double principal) {
        this.principal = principal;
        this.tenure = 1;
        this.interestRate = 10;
    }

    public double calculateEMI() {
        double monthlyInterestRate = (interestRate / 12) / 100;
        int tenureInMonths = tenure * 12;
        double emi = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, tenureInMonths)) / (Math.pow(1 + monthlyInterestRate, tenureInMonths) - 1);
        return emi;
    }
}

public class EMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        Loan loan = new Loan(principal);
        double emi = loan.calculateEMI();

        System.out.println("Calculated EMI: " + emi);
    }
}