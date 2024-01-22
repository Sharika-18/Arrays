/*
Given a vector of N positive integers and an integer X. The task is to find the frequency of X in vector.
*/
package array;
public class occurence {
        int findFrequency(int A[], int x){
            int count =0;
            for(int i=0;i<A.length;i++){
                if(x==A[i]){
                    count++;
                }
            }
            return count;
        }
}
