// Question Link: https://www.codingninjas.com/studio/problems/group-anagrams_800285

import java.util.* ;
import java.io.*; 
public class Solution {

  public static String sortWord(String s){
    char[] c = s.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }

  public static HashMap<String, ArrayList<String>> getAnagrams(ArrayList<String> inputStr){
    HashMap<String, ArrayList<String>> map = new HashMap<>();
    for(List<String> str : inputStr){
      String word  = sortWord(str);
      if(!map.containsKey(word)){
        map.put(word, new ArrayList<>());
      }
      map.get(word).add(str);
    }
    return map;
  }

  public static ArrayList<ArrayList<String>> getGroupedAnagrams(ArrayList<String> inputStr, int n) {
		// Write your code here.
    ArrayList<ArrayList<String>> ans = new ArrayList<>();
    HashMap<String, ArrayList<String>> map = getAnagrams(inputStr);
    for(ArrayList<String> str : map.values()){
      ans.add(new ArrayList<>(str));
    }
    return ans;
	}
}
