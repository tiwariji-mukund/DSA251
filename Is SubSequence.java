// Question Link: https://www.codingninjas.com/studio/problems/is-subsequence_892991

import java.util.* ;
import java.io.*; 
public class Solution {

	public static String isSubsequence(String str1, String str2) {    
    	// Write your code here
		int i=0, j=0, count=0, m=str1.length(), n=str2.length();
		while(i<m && j<n){
			if(str1.charAt(i)==str2.charAt(j)){
				count++;
				i++;
			}
			j++;
		}
		return (count!=m) ? "False" : "True";
	}

}
