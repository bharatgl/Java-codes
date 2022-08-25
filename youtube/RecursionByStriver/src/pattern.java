import java.util.Scanner;

public class pattern {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
           for (int i = 1; i < n; i++) {
            for (int j = 1; j < i+1; j++) { // i = 1, j < 2 -
                  System.out.print(j+"");
            }
            System.out.println();
           } 
      }
      
}
