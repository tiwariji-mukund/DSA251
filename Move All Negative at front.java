// Question Link: https://www.codingninjas.com/studio/problems/move-all-negative-numbers-to-beginning-and-positive-to-end_1112620

public class Solution {

    public static int[] separateNegativeAndPositive(int a[]) {
        int n=a.length;
        if(n<1) return a;
        int i=0, j=n-1;
        while(i<j){
            if(a[i]<0) i++;
            else if(a[j]<0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            else j--;
        }
        return a;
    }
}
