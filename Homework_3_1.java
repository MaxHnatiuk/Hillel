import java.util.Scanner;

public class Homework_3_1 {
    public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    int number, temp;
    boolean isPrime = true;
    System.out.println("Enter a number: ");
    number = num.nextInt();
    if (number % 2 == 0 && number !=0)
    {
        System.out.println("- Even number");
    }
    else if (number != 0)
    {
        System.out.println("- Odd number");
    }
    if (number > 0)
    {
        System.out.println("- Positive");
    }
    else if (number < 0)
    {
        System.out.println("- Negative");
    }
    else
    {
        System.out.println("- The number is zero");
    }
    if (number < 2){
        isPrime = false;
    }
    for (int i = 2; i * i < number; i++)
    {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }
    if(isPrime) {
        System.out.println("- Prime number");
    }
    else
    {
        System.out.println("- Compound number");
    }
    }
}
