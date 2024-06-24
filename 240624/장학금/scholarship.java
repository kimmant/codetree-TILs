import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();

        if(score1 >=90){

         if(score2 >= 95 )
            System.out.println("10");
         else if(score2 >=90)
            System.out.println("5");
         else
            System.out.println("0");
        }
        else
            System.out.println("0");
    }

}