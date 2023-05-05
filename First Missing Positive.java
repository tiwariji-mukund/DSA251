/* You are given an array "ARR" of integers of length N. Your task is to find the first missing positive integer in linear time and constant space. 
In other words find the lowest positive integer that does not exist in the array. The array can have negative numbers as well.

For example, the input [3,4,-1,1] should give output 2 because it is the smallest positive number that is missing in the array.

Sample Input 1: 
1
5
3 2 -6 1 0

Sample Output 1:
4

Sample Input 2:
1
5
0 1 2 3 4

Sample Output 2:
5
*/

import java.util.*;
import java.io.*;

public class Solution{
  public static int firstMissing(int [] arr, int n){
    // Write your code here.
    Arrays.sort(arr);
    int i=0;
    while(i<n && arr[i]<=0){
      i++;
    }
    int j=1;
    while(i<n && arr[i]==j){
      j++;
      i++;
    }
    return j;
  }
}


/* Approach:
1. Sort the given array
2. Initialise i and traverse all the negative values
3. After traversing all the negative values i enter in positive values
4. Initialise j and check if arr[i] matches with j
5. Increment arr[i] and j
6. Once arr[i] does not matches with j, come out of the loop
7. Return j
*/
