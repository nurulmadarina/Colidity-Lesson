
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);     
        int min = 1; 
        int cap = A.length; 
        for (int i = 0; i < cap; i++){
            if(A[i] == min){
                min++;
            }
        }   
        
        return min; 
    }
}