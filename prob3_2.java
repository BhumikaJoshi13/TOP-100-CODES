//-----------TOP 100 CODES----------

//Q.Sum of first N Natural Numbers
/* The numbers greater than 0 are Natural Numbers 
 *  There are two ways to calculate sum of First N Natural Numbers.
 * 1)Using Mathematical Formula -
 *    Sum = (N*(N+1)/2)
 * 2)Using a for loop
 * 
 * In this vedio we will use second method.
*/
public class prob3_2{
    public static void main(String[] args){
        int num =10;
        int sum=0;
        //we will use for-loop 
        for(int i=0;i<=num;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}