//----TOP 100 CODES ----
//AUTOMORPHIC NUMBER 
//(5)² = 25
//(25)² =625
//(376)² =141376


import java.util.Scanner;

public class prob19 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number -");
    int number = sc.nextInt();
    int square = number*number;
    int count = 0;
    int temp = number;
    while (temp >0) {
        count ++;
        temp = temp/10;
    }
    int lastDigit =  (int)(square %(Math.pow(10,count)));
    if (lastDigit == number) {
        System.out.println("Automorphic Number ");
    } else {
        System.out.println("Not a Automorphic Number");
    }
    
}
    
}