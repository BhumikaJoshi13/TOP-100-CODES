//---------Top 100 codes------------
//Q.Power of a number 


//Math.pow(base, power)
import java.util.Scanner;

public class prob14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of base - ");
        int base = scan.nextInt();
        System.out.print("Enter the value of power- ");
        int exp = scan.nextInt();
        int res = 1;
        while (exp!=0) {
            res *=base;
            exp--;

        }
        System.out.println(res);
       
       
    }
}
