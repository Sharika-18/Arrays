//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
package array;
public class sort0s1s2s {
    public static void sort012(int a[], int n)
    {
        // code here 
       int l = 0;
       int h = n-1;
       for(int i=0; i<n && i<=h;){
            // Current element is 0
            if (a[i] == 0) {
                swap(a, l, i);
                l++;
                i++;
            }
            // Current element is 2
            else if (a[i] == 2) {
                swap(a, i, h);
                h--;
            }
            // Current element is 1
            else {
                i++;
            }
        }
    }
     static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
     }
}

