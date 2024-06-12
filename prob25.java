//---TOP 100 CODES ----
//BINARY TO DECIMAL CONVERSION

import java.util.Scanner;
public class prob25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter binary Number - ");
        int binary = scan.nextInt();
        int decimal =0;
        int n = 0;
        while(binary>0){
            int temp = binary%10;
             decimal += temp *Math.pow(2, n);
             binary = binary/10;
             n++;

        }
        System.out.println("Decimal Number -" + decimal);
    }
}
