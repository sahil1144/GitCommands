import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        // 0 1 1 2 3 5 8 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to for series: ");
        int num = input.nextInt();
        input.close();

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");
        for(int i = 1; i <= num - 2; i++){
            int previous = 0;
            previous = a + b;
            System.out.print(previous + " ");
            a = b;
            b = previous;
        }
    }
}