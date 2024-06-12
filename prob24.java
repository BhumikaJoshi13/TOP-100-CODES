//------top 100 codes -------
//LCM - LEAST COMMON MULTIPLE 

import java.util.Scanner;

public class prob24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number - ");
        int a = scan.nextInt();
        System.out.println("Enter second number - ");
        int b = scan.nextInt();

        int lcm = (a>b)?a:b;
        while (true) {
            if(lcm%a == 0&& lcm %b ==0){
                System.out.println("The lcm is - "+ lcm);
                break;
            }
            ++lcm;
        }
    }
}
