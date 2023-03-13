package OOP;

public class Credit {
    private String name;
    private double amount;
    private double interestRate;
    private int termInMonths;

    public Credit(String name, double amount, double interestRate, int termInMonths) {
        this.name = name;
        this.amount = amount;
        this.interestRate = interestRate;
        this.termInMonths = termInMonths;
    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public int getTermInMonths() {
        return termInMonths;
    }

    //Підрахунок щомісячного платежу
    public double getMonthlyPayment() {
        double monthlyInterestRate = interestRate / 12.0;
        double monthlyPayment = (amount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -termInMonths));
        return monthlyPayment;
    }

    //Підрахунок загальної суми, яку треба сплатити
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * termInMonths;
        return totalPayment;
    }

    //Отримання загального відсотка, який треба сплатити
    public double getTotalInterest() {
        double totalInterest = getTotalPayment() - amount;
        return totalInterest;
    }
}
