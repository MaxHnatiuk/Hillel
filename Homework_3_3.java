import java.util.Scanner;

public class Homework_3_3 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        double numb, cost, tax, salary_1, salary_2, days = 0;
        System.out.println("Enter the month number: ");
        numb = num.nextInt();
        if (numb == 1 || numb == 3 || numb == 5 || numb == 7 || numb == 8 || numb == 10 || numb == 12)
        {
            days = 31;
        }
        else if (numb == 4 || numb == 6 || numb == 9 || numb == 11)
        {
            days = 30;
        }
        else if (numb == 2)
        {
            days = 28;
        }
        System.out.println("Enter the hourly rate: ");
        cost = num.nextInt();
        System.out.println("Enter the tax percentage: ");
        tax = num.nextInt();
        salary_1 = ((days - 8) * cost * 8) ;
        System.out.println("Salary without taxes: " +salary_1);
        salary_2 = (days - 8) * cost * 8 - ((days - 8) * cost * 8) * tax / 100;
        System.out.println("Salary with taxes: " +salary_2);
    }
}
//left triangle
//for (int i = 0; i < h1; i++) {
//                for (int j = 0; j <= i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//                  }
//right triangle
//for (int i = 0; i < h2; i++) {
//                for (int j = 0; j < h2; j++) {
//                    if (j < h2 - (1 + i)) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("*");
//                    }
//                }
//                System.out.println();
//            }
//equilateral triangle
// for (int i = 1; i <= h3; i++) {
//                for (int j = 1; j <= h3 - i; j++) {
//                    System.out.print(" ");
//                }
//                for (int k = 1; k <= i * 2 - 1; k++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }