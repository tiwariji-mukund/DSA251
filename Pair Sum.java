// Question Link: https://www.codingninjas.com/studio/problems/pair-sum_1171154
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
        int i=0, j=n-1, count=0;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum==target){
                count++;
                i++;
                j--;
            }
            else if(sum>target) j--;
            else i++;
        }
        return (count==0) ? -1 : count;
    }
}
