//Check whether the number is positive or negative
import java.util.Scanner;
public class prob1{
    public static void main(String[] args){
        System.out.println("Enter Number:- ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num>0){
            System.out.println("The given number is positive");

        }else{
            System.out.println("The give number is Negative.");
        }
        scan.close();
    }
}