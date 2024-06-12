//-----------TOP 100 CODES----------
//Q.To check whether a number is palindrome or not 
import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rev_Num = reverseNum(num);
        if (num == rev_Num) {
            System.out.println("The Number is a palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
    static int reverseNum(int num){
        int reverse =0;
        int rem ;
        while(num!=0){
            rem = num%10;
            reverse = reverse*10+rem;
            num/=10;
        }
        return reverse;
    }
}
