//rotate left
//1 2 3 4 -> 2 3 4 1
package array;
import java.util.Scanner;
public class rotateleft {
    public static void main(String[] args){
       try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
           int[] arr = new int[n];
           
           //input
           for (int i=0 ;i<n;i++){
            arr[i] = sc.nextInt();
           }

           int temp = arr[0];
           for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
           }
           arr[n-1] = temp;
           for(int i= 0; i<n;i++){
           System.out.print(arr[i]);
           }
    }
    }
}
