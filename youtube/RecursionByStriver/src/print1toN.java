import java.util.Scanner;

public class print1toN {
    public static void printNumbersOneToN(int i, int n){
        if(i>n)
            return;
        System.out.println(i);
        printNumbersOneToN(i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        printNumbersOneToN(1,n);
    }
}
