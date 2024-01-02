public class Main {
    public static void main(String[] args) {
      int a=5,b=6,c=7;
/*      int temp1 , temp2;
      temp1=a;
      temp2=b;
      a=c;
      b=temp1;
      c=temp2;
*/
       int temp = a;
        a = c;
        c = b;
        b = temp;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
        // 여기에 코드를 작성해주세요.
    }
}