//----TOP 100 CODES -----


public class prob17 {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;
        for(int i =1;i<num;i++){
            if (num%i==0) {
                sum = sum+i;
            }
        }
        if (sum == num ) {
            System.out.println("It is a perfect Number ");
        }else{
            System.out.println("It is not");
        }
    }
}
