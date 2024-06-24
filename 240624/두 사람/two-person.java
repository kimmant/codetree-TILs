import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  age_a = sc.nextInt();
        char  a = sc.next().charAt(0);
        int age_b = sc.nextInt();
        char b = sc.next().charAt(0);
       

         if( (age_a>=19 && a == 'M')|| (age_b>=19 && b == 'M'))
            System.out.println("1");
         else
            System.out.println("0");
       
    }

}