/* Given an a Array with N elements the task is to rotate the array to the left by K steps, where K is non-negative.

Sample Input:
8
7 5 2 11 2 43 1 1
2

Sample Output:
2 11 2 43 1 1 7 5

Explanation:
Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
Rotate 2 steps to the left: 2 11 2 43 1 1 7 5
*/

import java.util.*;
import java.io.*;

class Solution{
  public static int[] rotateArray(int arr[], int k){
    int count = 0;
    int ans[] = new int[arr.length]; //create a new array which will store the rotation after k steps of initial array
    for(int i=0; i<arr.length-k; i++){
      ans[i] = arr[i+k]; //at i=0, i need the element present at i+k i.e., if i=2 and k=2 i need element at 4th position in arr to be placed at 2nd position in ans 
      count++; //this will help in increasing the position after initial rotation gets completed
    }
    for(int i=0; i<k; i++){
      ans[count+i] = arr[i];
    }
    return ans;
  }
  
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(); //It will take the length of the array as input
    int[] arr = new int[n]; //now i've created the array of length n
    int k = s.nextInt(); //it will rotate the array  in left direction by K steps;
    
    //now take the array element from input
    for(int i=0; i<n; i++){
      arr[i] = s.nextInt();
    }
    
    //create a new array or a rotated array after the K steps
    int ans[] = rotateArray(arr, k);
    
    //print the rotatd array
    for(int i=0; i<n; i++){
      System.out.print(ans[i] + " ");
    }
  }
