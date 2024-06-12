//-----------TOP 100 CODES----------

//Q. Greatest of two Numbers

import java.util.Scanner;

public class prob4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int result;
        System.out.println("Enter any two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        result = (num1>num2)? num1:num2;
        System.out.println("The greatest number is "+ result);
    }
}
