import java.util.Scanner;
public class testName {
   public static void  testingName(int i, int n)  {
    if(i>n)
        return;
       System.out.println("Bharat");
       testingName(i+1,n);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n =  sc.nextInt();
        testingName(1,n);
    }
}
