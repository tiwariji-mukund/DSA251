// Question Link: https://www.codingninjas.com/studio/problems/842495

import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		int count = 0, candidate  = -1;
		for(int i=0; i<n; i++){
			if(count==0){
				candidate = arr[i];
				count = 1;
			}
			else if(arr[i]==candidate) count++;
			else count--;
		}
		count = 0;
		for(int i=0; i<n; i++){
			if(arr[i]==candidate) count++;
		}
		return (count>(n/2)) ? candidate : -1;
	}
}
