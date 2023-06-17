//WAP to find a Factorial of a given integer
import java.util.Scanner;
public class Problem4 {
    static int customFactorial(int number){
        if(number == 1 || number == 0){
            return number;
        }
        else{
            return number * customFactorial(number-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number whose factorial is need to be find: ");
        int num = input.nextInt();
        int fact = 1;
        //This is by iterative method
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("================ ITERATIVE METHOD ================");
        System.out.println("The Factorial of the given number is: "+ fact);
        //This is by calling a recursive function
        int factMethod = customFactorial(num);
        System.out.println("================ RECURSIVE METHOD ================");
        System.out.println("The Factorial of the given number is: "+factMethod);
    }
}

