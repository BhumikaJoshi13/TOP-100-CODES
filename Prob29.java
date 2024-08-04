
class Prob29{
    public static void main(String[] args) {
        System.out.println("Hexadecimal of 10 is: "+hexconvert(10));  
        System.out.println("Hexadecimal of 15 is: "+hexconvert(15));  
        System.out.println("Hexadecimal of 289 is: "+hexconvert(289));  

    }

    static String hexconvert(int num){
        int rem ;
        String hex = "";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(num!=0){
            rem = num % 16;
            hex = hexchars[rem]+hex;
            num = num / 16;

        } 
        return hex;
    }
   
}