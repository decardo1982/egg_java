/*Write a function to split a string and convert it into an array of words.
"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]*/
package codewars;

import java.util.Arrays;


public class StringToArray {
    
    public static void main(String[] args) {
        String s = "I love arrays they are my favorite";
        String[] arrayNew = s.split(", ");
        
        System.out.println("Array: " + Arrays.toString(arrayNew));
        
        
        
    }
    
}
