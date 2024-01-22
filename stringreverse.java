//You are given a string s. You need to reverse the string.
package array;

public class stringreverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String reverse ="";
        for(int i=0;i< str.length();i++){
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
        
    }
}

