/*
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
*/
package array;

public class minmax {
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long max =a[0],min = a[0];
        for(int i=0;i<n;i++){
            if(max < a[i]){
                max= a[i];
            }
            if(min > a[i]){
                min =a[i];
            }
        }
        return new Pair(min,max);
    }
}

