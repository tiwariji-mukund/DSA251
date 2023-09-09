// Question Link: https://www.codingninjas.com/studio/problems/count-all-sub-arrays-having-sum-divisible-by-k_973254

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public Solution{

  public static int subArrayCount(ArrayList < Integer > arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int ans = 0, rem = 0;
    long sum = 0;
    for(int i=0; i<arr.size(); i++){
      sum += arr.get(i);
      rem = (int)(sum%k+k)%k;
      if(map.containsKey(rem)){
        ans += map.get(rem);
      }
      map.put(rem, map.getOrDefault(rem, 0)+1);
    }
    return ans;
  }
}
