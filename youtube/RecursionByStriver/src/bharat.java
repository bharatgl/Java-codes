import java.util.*;
import java.io.*;
public class bharat {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int tc = Integer.parseInt(br.readLine().trim());
                while (tc-- > 0) {
                    String[] inputLine;
                    int n = Integer.parseInt(br.readLine().trim());
                    int[] arr = new int[n];
                    inputLine = br.readLine().trim().split(" ");
                    for (int i = 0; i < n; i++) {
                        arr[i] = Integer.parseInt(inputLine[i]);
                    }

                    int ans = new Solution().print2largest(arr, n);
                    System.out.println(ans);
                }
            }
        }

        class Solution {
            int print2largest(int arr[], int n) {
                // code here
            return 0;
            }
            int printLargest(int arr[],int n){
                int temp = arr[0];
                for(int i = 0;i<n;i++){
                    if(arr[i]>temp){
                        temp = arr[i];
                    }
//                    return temp;

                }

                return temp;
            }
        }
