//-----------TOP 100 CODES----------
//WAP FOR FIBONACCI SERIES

public class prob12 {
    public static void main(String[] args) {
        int num =15;
        int a = 0;
        int b = 1;
        int nextTerm;
        System.out.print(a + " " + b + " ");
        for(int i =2;i<num ;i++){
            nextTerm=a+b;
            a=b;
            b= nextTerm;
            System.out.print(nextTerm+ " ");
        }
    }
}
