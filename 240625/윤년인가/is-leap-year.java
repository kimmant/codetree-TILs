import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        

     if (a % 4 == 0 || a % 400 == 0 ) {
             System.out.println("ture");
     }
     else {
             System.out.println("false");
     }
    }
}