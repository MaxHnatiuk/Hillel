import java.util.Calendar;
public class Homework_4_4 {
    public static void main(String[] args) {
        // Вхідні дані
        int hourlyRate = 80; // вартість години
        int taxRate = 10; // відсоток податку

        // Розрахунок заробітної плати за місяць
        int workDaysPerMonth = 20;
        int workHoursPerDay = 8;
        int workingHoursPerMonth = workDaysPerMonth * workHoursPerDay; // загальна кількість робочих годин в місяць
        int grossSalaryPerMonth = workingHoursPerMonth * hourlyRate; // заробітна плата за місяць без податку
        int taxPerMonth = grossSalaryPerMonth * taxRate / 100; // сума податку за місяць
        int netSalaryPerMonth = grossSalaryPerMonth - taxPerMonth; // заробітна плата за місяць з податками

        // Розрахунок заробітної плати за рік
        int grossSalaryPerYear = grossSalaryPerMonth * 12; // заробітна плата за рік без податку
        int taxPerYear = grossSalaryPerYear * taxRate / 100; // сума податку за рік
        int netSalaryPerYear = grossSalaryPerYear - taxPerYear; // заробітна плата за рік з податками

        // Виведення результатів
        System.out.println("JAN " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("FEB " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("MAR " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("APR " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("MAY " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("JUN " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("JUL " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("AUG " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("SEP " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("OCT " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("NOV " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("DEC " + grossSalaryPerMonth + " " + netSalaryPerMonth);
        System.out.println("TOTAL: " + grossSalaryPerYear + " " + netSalaryPerYear);
    }
}