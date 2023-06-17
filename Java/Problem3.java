//WAP to find a Factor of a given number
import java.util.Scanner;
public class Problem3 {
    static int customFactor(int number,int testNumber){
       int temp = testNumber;
       if(temp < number){
        // System.out.println(temp);
        if(number % temp == 0){
            System.out.print(temp + ", ");
        }
        return customFactor(number, temp + 1);
       }
       System.out.println(number);
       return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number whose factors are need to be find: ");
        int num = input.nextInt();
        System.out.println("================ ITERATIVE METHOD ================");
        System.out.print("The factors of the given number are: ");
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println(num);
        System.out.println("================ RECURSIVE METHOD ================");
        System.err.print("The factors of the given number are: ");
        int factors = customFactor(num, 1);
    }
}
