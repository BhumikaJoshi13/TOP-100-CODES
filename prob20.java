/**
 * TOP 100 CODES
 * Problem - 20 HARSHAD NUMBERS
 * eg. 18 -> 1+8 = 9
 */
import java.util.Scanner;
public class prob20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int n = num;
        int sum = 0;
        int last;
        while (n!=0) {
            last = n%10;
            sum = sum+last;
            n/=10;
        }
        if (num %sum ==0) {
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}