//-----------TOP 100 CODES----------

//Q. Leap Year Or not 
//the 2 condtion:-
//div by 400
//div 4 but not by 100
//2000, 2004, 2024
import java.util.Scanner;
public class prob6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year %400==0){
            System.out.println("Is a leap year");
        } else if(year%4==0 && year%100!=0){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }
        sc.close();
    }
}