import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
    

        System.out.printf("%.0f %.1f",a+b,(a+b)/2);
    }
}