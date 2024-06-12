//-----------TOP 100 CODES----------

//Q.To calculate Sum of digits 
//For eg. -> 239 = 2+3+9=14
import java.util.Scanner;
public class prob8 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the digit:");
    int num = scan.nextInt();
    int sum=0;
    while(num!=0){
        sum +=num%10;
        num = num/10;
    }
   
    System.out.println("The sum is "+ sum);
 }
}
