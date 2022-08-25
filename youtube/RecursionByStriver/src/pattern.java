import java.util.Scanner;

public class pattern {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
      //      for (int i = 1; i < n; i++) {
      //       for (int j = 1; j < i+1; j++) { // i = 1, j < 2 -
      //             System.out.print(j+"");
      //       }
//   ------------------------------------------------------------
      //     pattern 2
      //      for (int i = 1; i < n; i++) {
      //       for (int j = 1; j < i+1; j++) { // i = 1, j < 2 -
      //             System.out.print(i+"");
      //       }

//      // -----------------------------------------
        //pattern 3
            // for (int i = 0; i < n; i++) {
            // for (int j = i; j < n; j++) { 
            //       System.out.print("*"+"");
            // }


  // -----------------------------------------
      // //   //pattern 4
      //   for (int i = 0; i <n; i++) {
      //       for (int j = 1; j <=n-i; j++) { 
      //             System.out.print(j+"");
      //       }


 //_________-------------------------------------___________________________________________________
//    //   //pattern 5
//    for (int i = 0; i <n; i++) {
//       for (int j = 1; j <=n-i; j++) { 
//             System.out.print(j+"");
//       }

//-----------------------------------------------------------

 //   //pattern 5
//  for (int i = 0; i <n; i++) {
//       for (int j = 1; j <=n-i; j++) { 
//             System.out.print(j+"");
//       }

//---------------------------------------------------------
      for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) { 
            System.out.print("*"+"");
      }








            System.out.println();
           } 
      }
      
}
