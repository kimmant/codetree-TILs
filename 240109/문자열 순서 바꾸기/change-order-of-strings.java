import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String q,s = sc.next();
        String t = sc.next();
        q=s;
        s=t;
        t=q;
        System.out.println(s);
        System.out.print(t);
     
    }
}