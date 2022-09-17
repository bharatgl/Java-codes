import java.io.*;
import java.util.*;
public class name {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int N = sc.nextInt();
          String str = sc.next();
             Name(str,N);

      }
      public static void Name(String str,int N){
       if(N<1)return;
       Name(str,N-1);
       System.out.println(str+" ");
      }
}
