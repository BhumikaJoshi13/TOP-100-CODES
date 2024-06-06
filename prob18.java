//--------top 100 codes ---------

//Perfect Square 
//4 2*2
import java.util.Scanner;
public class prob18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number-");
        int number = sc.nextInt();
        if (perfectSquare(number)) {
            System.out.println("It is a perfect Square");
        } else {
            System.out.println("It is not.");
        }

    }
    public static boolean perfectSquare(int num){
        for(int i =1;i*i<=num;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}
