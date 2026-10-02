import java.util.Scanner;
public class Day31 {
    public static void main(String [] args) {
    Scanner hai = new Scanner(System.in);

    int a = hai.nextInt();  
    int b = hai.nextInt();  
      
    System.out.printf("%d > 1 && %d > 1: %b %n",a,b, a > 1 && b > 1 );  
    System.out.printf("%d > 1 || %d > 1: %b %n",a,b, a > 1 || b > 1 );  
    System.out.printf("!(%d > 1 ): %b %n",a, !( a > 1 ));  
  
    }
}
