import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int e1 = sc.nextInt();
        int m2 = sc.nextInt();
        int e2 = sc.nextInt();

       

         if( m1>m2 )
            System.out.println("A");
         else if( m1<m2)
            System.out.println("B");

         else if(m1==m2 && e1 > e2)
            System.out.println("A");
         else
            System.out.println("B");
       
    }

}