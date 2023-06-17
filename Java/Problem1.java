//WAP to find a sum of even number into 1D array.
import java.util.Scanner;
public class Problem1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of digits you want to enter in an array: ");
        int n  = input.nextInt();
        int[] inputArray = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+ i + "th element of the array: ");
            inputArray[i] = input.nextInt();
            if(inputArray[i]%2==0){
                sum += inputArray[i];
            }
        }
        System.out.print("The sum of the even numbers in the given array is: "+sum);
    }
}