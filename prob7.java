//-----------TOP 100 CODES----------

//Q.Check whether a number is prime  Number or not 
//2 ,3 ,5 ,7,11
import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = scan.nextInt();
        Checkprime(n);
        
    }
    public static void Checkprime(int n){
       int count = 0;
       if(n<2){
        System.out.println("It is not a prime number");
        System.exit(n);
       }
       for(int i=1;i<=n;i++){
        if(n%i==0){
            count+=1;
        } 
       }
       if(count>2){
        System.out.println("It is not a prime number");
    }else{
        System.out.println("It is prime number");
    }
    }
    
}
