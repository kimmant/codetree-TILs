import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String b;
        a = sc.nextInt();
       

        b = a <= 100 ? "pass" : "failure";

        System.out.println(b);
    }
}