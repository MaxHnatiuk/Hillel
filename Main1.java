package java;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, third, result;
        System.out.println("Number of hours per week: ");
        first = num.nextInt();
        System.out.println("Cost of an hour of work: ");
        second = num.nextInt();
        System.out.println("Tax percentage: ");
        third = num.nextInt();
        result = (first * second) * 4;
        System.out.println("result = " + result); // Зарплатня на місяць без податків
        result = (((first * second) * 4) - (((first * second) * 4) * third) / 100 );
        System.out.println("result = " + result); // Зарплатня на місяць із податками
        result = (first * second) * 48;
        System.out.println("result = " + result); // Зарплатня на рік без податків
        result = (((first * second) * 48) - (((first * second) * 48) * third) / 100 );
        System.out.print("result = " + result); // Зарплатня на рік із податками
    }
}
