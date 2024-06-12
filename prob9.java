//-----------TOP 100 CODES----------
//Q.Reverse a Number

import java.util.Scanner;
  
public class prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem;
        while (num!=0) {
            rem = num%10;
            System.out.print(rem);
            num/=10;
        }
    }
}
