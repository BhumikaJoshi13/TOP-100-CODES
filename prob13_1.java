//--------TOP 100 CODES------
//Calculate factorial without multiplication
        //5! = 5*4*3*2*1
        //5! = 120 
        //5! = (5+5+5+5)*3*2*1
        //5! = (20+20+20)*2*1
        //5! = (60+60)*1
        //5! = 120

import java.util.Scanner;
public class prob13_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number-");
        int num = scan.nextInt();
        int ans = num ;
        for(int i = num -1;i>0;i--){
            int sum =0;
            for(int j =0;j<i;j++){
                sum +=ans;
            }
            ans = sum ;
        }
        System.out.println(ans);
        
    }
}
