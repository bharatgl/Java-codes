import java.util.Scanner;

public class printNto1 {
    public static void printNToOne(int i, int n) {
        if(i<1)
            return;
            System.out.println(i);
            printNToOne(i-1,n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       printNToOne(n,n);
    }
}
