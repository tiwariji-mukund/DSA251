// Question Link: https://www.codingninjas.com/studio/problems/container-with-most-water_873860

public class Solution {

	public static int maxArea(int[] height) {
	    // Write your code here.
		int i = 0, j = height.length-1, max = Integer.MIN_VALUE;
		while(i<j){
			int area = Math.min(height[i], height[j]) * (j-i);
			max = Math.max(area, max);
			if(height[i]<=height[j]) i++;
			else j--;
		}
		return max;
	}
}
