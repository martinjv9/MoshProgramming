package Beginner;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public int calculateWate() {
        return baseSalary;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be less then or equal to 0");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return this.baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return this.hourlyRate;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
