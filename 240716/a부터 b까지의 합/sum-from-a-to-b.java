import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

       if(a<b){

        for(int i=a ; a <=b ; a++)
            sum +=a;
        }

        System.out.print(sum);
    }
}