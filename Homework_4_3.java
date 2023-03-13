import java.util.Scanner;

public class Homework_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть загальну суму кредиту: ");
        double loanAmount = input.nextDouble();

        System.out.print("Введіть місячний відсоток на залишок по кредиту: ");
        double monthlyInterestRate = input.nextDouble() / 100;

        System.out.print("Введіть 1, щоб розрахувати кількість щомісячних платежів, або 2, щоб розрахувати " +
                "суму щомісячного платежу: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Введіть суму щомісячного внеску: ");
            double monthlyPayment = input.nextDouble();
            double months = calculateMonthsForPayment(loanAmount, monthlyInterestRate, monthlyPayment);
            System.out.println("Необхідно зробити " + months + " щомісячних платежів для повного погашення кредиту.");
        } else if (choice == 2) {
            System.out.print("Введіть кількість платежів: ");
            int numPayments = input.nextInt();
            double monthlyPayment = calculateMonthlyPayment(loanAmount, monthlyInterestRate, numPayments);
            System.out.printf("Сума щомісячного платежу: %.2f", monthlyPayment);
        } else {
            System.out.println("Неправильний вибір!");
        }

        input.close();
    }

    public static int calculateMonthsForPayment(double loanAmount, double monthlyInterestRate, double monthlyPayment) {
        int months = 0;
        while (loanAmount > 0) {
            double interest = loanAmount * monthlyInterestRate;
            loanAmount += interest;
            loanAmount -= monthlyPayment;
            months++;
        }
        return months;
    }

    public static double calculateMonthlyPayment(double loanAmount, double monthlyInterestRate, int numPayments) {
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate,
                -numPayments));
        return monthlyPayment;
    }
}