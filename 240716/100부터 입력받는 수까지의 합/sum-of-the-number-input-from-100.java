import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;


        for(int i=n ; n <=100 ; n++){
            sum +=n;
        }

        System.out.print(sum);
    }
}