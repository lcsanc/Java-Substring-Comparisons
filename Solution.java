/*
Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
Explanation 0

String  has the following lexicographically-ordered substrings of length :

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";
        
        for (int i=0; k<=s.length(); i++)
        {
            //temp = s.substring(i,k);
            //System.out.println(s.substring(i,k));
            if ((s.substring(i,k).compareTo(smallest))<0)
            {
               //largest = smallest; 
               smallest = s.substring(i,k); 
               //System.out.println("smallest "+ smallest);
               //System.out.println("largest " + largest);
            }
            else if((s.substring(i,k).compareTo(largest))>0)
            {  
               largest = s.substring(i,k); 
               //System.out.println("smallest "+ smallest);
               //System.out.println("largest " + largest);
            }
            //System.out.println(k); 
            k++; 
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}