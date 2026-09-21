import java.util.Scanner;

public class SumOfDigit{
    //Method to return sum of digits
    public static int sumOfDigit(int number){

        int sum = 0;

        while(number != 0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
    //Entry point of the program  
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you digits");
        int digit = input.nextInt();
        input.close();

        int sumOfDigit = sumOfDigit(digit);

        System.out.println("Sum of Digits: " + digit + " = " + sumOfDigit);
    }
}
