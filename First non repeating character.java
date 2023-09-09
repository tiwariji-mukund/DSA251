// Question Link: https://www.codingninjas.com/studio/problems/first-non-repeating-character_920324

import java.util.* ;
import java.io.*; 
public class Solution {

  public static char firstNonRepeatingCharacter(String str) {
    // Write your code here
    Map<Character, Integer> map = new HashMap<>();
    for(char c : str.toCharArray()){
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for(char c : str.toCharArray()){
      if(map.get(c)==1) return c;
    }
    return str.charAt(0);
  }
}
