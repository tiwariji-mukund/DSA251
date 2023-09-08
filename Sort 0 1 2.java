// Question Link: https://www.codingninjas.com/studio/problems/631055

import java.util.* ;
import java.io.*;
import java.lang.reflect.Array; 
public class Solution {
    public static void sort012(int[] arr){
        //Write your code here
        int low=0, mid=0, high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else if(arr[mid]==1) {mid++;}
        }
    }
}
