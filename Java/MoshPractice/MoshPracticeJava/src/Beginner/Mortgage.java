package Beginner;

import java.text.NumberFormat;

public class Mortgage {
    final static int monthsInYear = 12;
    final static int percent = 100;

    private int principal;
    private double annualInterest;
    private int years;
    private double mortgage;
    private double monthlyInterest;

    public Mortgage(int principal, double annualInterest, int years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
        this.monthlyInterest = this.annualInterest / percent / monthsInYear;
        this.mortgage = calculateMortgage();
    }

    private double calculateMortgage() {
        int numberOfPayments = this.years * monthsInYear;
        mortgage = principal * (this.monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }

    private double calculateBalance(int months) {
        int numberOfPayments = years * monthsInYear;
        double balance = principal
                * (Math.pow(1 + this.monthlyInterest, numberOfPayments) - Math.pow((1 + monthlyInterest), months))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);

        return balance;
    }

    public void printMortgage() {
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(this.mortgage);
        System.out.println("Mortgage" + '\n' + "--------" + '\n' + "Mortgage: " + mortgageFormated);
    }

    public void printPaymentSchedule() {
        System.out.println("Payment Schedule" + '\n' + "----------------");
        for (int month = 1; month <= years * monthsInYear; month++) {
            double balance = calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static void main(String[] args) {

    }
}