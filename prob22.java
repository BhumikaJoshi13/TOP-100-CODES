//----TOP 100 CODE SERIES ------
//Freiendly Pair 

import java.util.Scanner;

public class prob22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt() ;
        int num2 = scan.nextInt();
        int sum1 = divisorSum(num1);
        int sum2 = divisorSum(num2);
        if (sum1/num1 == sum2 / num2) {
            System.out.println("They are Freindly pair");
        }
        else{
            System.out.println("They are not Freindly pair");
        }
    }

        static int divisorSum(int num){
            int sum =0;
            for(int i =1;i<num;i++){
                {
                    if (num%i ==0) {
                        sum = sum +i;
                    }
                }
            }
            return sum ;
        }
    
   
}
