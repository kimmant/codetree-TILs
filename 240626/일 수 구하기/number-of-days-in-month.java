import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n=sc.nextInt();;

        
        if(n<8) {
            if(n % 2 == 0) {
               if(n==2){
                  System.out.println("28");}
                else {
                    System.out.println("30"); }
            }
            else {
                System.out.println("31");
            }
        }
        else {
            if(n%2==1){
                System.out.println("30");
            }
            else {
                System.out.println("31");
            }
            System.out.println("false");
        }
    }
}