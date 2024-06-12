//-----------TOP 100 CODES----------
//Q.To check whether a number is Armstrong Number or not 


import java.util.Scanner;
public class prob11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number-");
        int n = scan.nextInt();
        int orginalNumber =n;
        int remainder;
        int num =0;
        while (orginalNumber!=0) {
            remainder =orginalNumber%10;
            num += Math.pow(remainder, 3);
            orginalNumber/=10;

        }
        if (num==n) {
            System.out.println("It is Armstrong Number");
        } else {
            System.out.println("It is Not ");
        }
        
        
    }
}
