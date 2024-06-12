
//----TOP 100 CODES -----
public class prob16 {
    public static void main(String[] args) {
    int num = 40585 ;
    if (detectStrong(num)) {
        System.out.println("Is a Strong Number");
    } else {
        System.out.println("It is not ");
    }
    }
    static int facto(int n){
        int fact = 1;
        for(int i =1; i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    static boolean detectStrong(int num){
         int digit, sum =0;
         int temp = num ;
         boolean flag = false ;
        while(temp !=0){
            digit = temp %10;
            sum = sum+facto(digit);
            temp /=10;

        }
        if (sum == num) {
            flag= true;
        } else {
            flag = false;
        }
        return flag;
    }
}

