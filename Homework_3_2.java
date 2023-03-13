import java.util.Scanner;

public class Homework_3_2 {
    public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    double cost = 870, number, discount = 0, total_cost;
    System.out.println("Enter a number: ");
    number = num.nextInt();
    if (number >= 11){
        discount = 5;
    }
    if (number >= 21){
        discount = 10;
    }
    if (number >= 31 && number < 41){
        discount = 12;
    }
    else if (number >= 41 && number < 51)
    {
        discount = 12.4;
    }
    else if (number >= 51 && number < 61)
    {
        discount = 12.8;
    }
    else if (number >= 61 && number < 71)
    {
        discount = 13.2;
    }
    else if (number >= 71 && number < 81)
    {
        discount = 13.6;
    }
    if (number >= 81){
    discount = 13;
    }
    total_cost = (cost * number) - ((cost * number) * discount/100);
    System.out.println("The total cost is: " +total_cost);
    }
}
