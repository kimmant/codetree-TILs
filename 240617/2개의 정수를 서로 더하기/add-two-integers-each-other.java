import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a+=b;
       // System.out.println(a+" "+ (b+a));
        b += a;

        System.out.println(a + " " + b);
    }
}