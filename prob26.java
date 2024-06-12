//----TOP 100 CODES ----
//OCTAL TO DECIMAL CONVERSION

import java.util.Scanner;

public class prob26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int octal = sc.nextInt();
        int decimal = 0;
        int n =0;
        while (octal>0) {
            int temp = octal %10 ;
            decimal += temp*Math.pow(8,n);
            octal = octal /10;
            n++;
        }
        sc.close();
        System.out.println("The decimal is " + decimal);
    }
}
