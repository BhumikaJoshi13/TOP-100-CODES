//-----------TOP 100 CODES----------

//Q. Check whether a number is even or odd

//To check if a number is even or odd , the given number should be 
// completely divisible by 2

import java.util.Scanner;//importing Scanner class
public class prob2{
    public static void main(String[] args){
        //Using Scanner class to tak input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num:- ");
        int num = scan.nextInt();//we use nextInt() to tak integer as an input
        scan.close();
        //using a if else statement to check for even and odd
        if(num%2==0){
            System.out.println("The given Number is Even.");
        }else{
            System.out.println("The given Number is odd.");
        }
    }
}
