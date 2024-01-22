// remove duplicates from sorted array
package array;
import java.util.Scanner;
public class removeduplicate {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            //input elements into array
            System.out.println("Input sorted array: ");
            for (int i=0 ;i<n ; i++){
                arr[i] = sc.nextInt();
            }

            int i = 0;
            for(int j=1;j<n;j++){
                if(arr[j] != arr[i]){
                    arr[i+1] = arr[j];
                    i++;
                }
            }
            System.out.print("Array after removing duplicates is :" + (i+1));
        }
    }
}
