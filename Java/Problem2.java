//WAP to find whether string is palindrome or not.
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the string which is need to be check: ");
      String inputString = input.next();
      String checkString = "";
      for (int i = inputString.length()-1; i >= 0 ; i--) {
        checkString += inputString.charAt(i);
      }
      if(checkString.equals(inputString)){
        System.out.println("The entered string is palindrome");
      }
      else{
        System.out.println("The entered string is not palindrome");
      }  
    }
}

