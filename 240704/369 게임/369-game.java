import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int n ,i =1;

        
        n = sc.nextInt();
    



        // 출력
        while( i <= n) {
            
            if(i % 3 == 0){
              System.out.print(0 + " ");
              i++;}
            else{
              System.out.print(i + " "); 
              i ++;}
        }
    }
}