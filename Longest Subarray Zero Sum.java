// Question Link: https://www.codingninjas.com/studio/problems/longest-subset-zero-sum_920321

import java.io.*;
import java.util.* ;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		// Write your code here.
		Map<Integer, Integer> map = new HashMap<>();
    int sum = 0, max = 0;
    for(int i=0; i<arr.size(); i++){
      sum += arr.get(i);
      if(sum==0) max = i+1;
      else{
        if(map.containsKey(sum)){
          max = Math.max(max, i-map.get(sum));
        }
        else map.put(sum, i);
      }
    }
    return max;
	}
}
