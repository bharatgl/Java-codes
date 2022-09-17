import java.util.Scanner;

class solution {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Long A = sc.nextLong();
            Long B = sc.nextLong();
            // long  gcd= 1;
            // long lcm = 1;
           
         
       lcmAndGcd(A, B) ;
             
      }

      static long gcd(Long A,Long B){
            if(B==0)return A;
            return(gcd(B,A%B));
            }
        static void lcmAndGcd(Long A , Long B) {
            // code here
            Long arr[]=new Long[2];
            //First question LCM
            arr[0]=(A*B)/gcd(A,B);
            //second question
            arr[1]=gcd(A,B);
            // return arr;
            printArr(arr);
        }
        public static void printArr(Long [] arr) {
            for (int i = 0; i < arr.length; i++) {
                  System.out.println(arr[i]+" ");
                  
            }
        }
    };
    