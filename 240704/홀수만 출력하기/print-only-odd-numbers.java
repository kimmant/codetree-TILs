import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        


        
        int N = sc.nextInt();

        
         for(int i=1; i<= N ; i++) {
            int n = sc.nextInt();

            if (n % 2==1 && n%3==0) {

                System.out.println(n);
            } 
        
        }
    }
}