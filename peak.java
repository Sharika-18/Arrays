/*
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists). Given an array arr[] of size N, Return the index of any one of its peak elements. 
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. Also, arr[] will be in ascending order before the peak element, and in descending order after that.
*/
package array;
class peak
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int max = arr[0],maxindex = 0;
       if(n==0){
           return 0;
       }
       for(int i=0;i<n;i++){
          if( max < arr[i]){
              max = arr[i];
              maxindex = i;
          }
       }
       return maxindex;
    }
}