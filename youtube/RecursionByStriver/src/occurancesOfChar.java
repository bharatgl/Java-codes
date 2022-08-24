import java.util.Scanner;

public class occurancesOfChar {
    public static void main(String[] args) {
        //Infinx
//        i =2 , n=2 , f=1, x =1;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        int i =0;
        int count = 0;
        for(;i<ch.length;i++){

            if(str.charAt(i) ==ch[i]){
                count ++;
                break;
            }
            i++;
        }
        if(count == 0){
            System.out.println("character not found");
        }else{
            System.out.println( ch [i] +count);
        }
    }
}
