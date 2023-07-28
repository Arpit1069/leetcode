// You are given an integer array height of length n. 
// There are n vertical lines drawn such that the two endpoints of the 
// ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, 
// such that the container contains the most water. 

public class _11containerWithMostWater {

}

class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for (int i = 0; i < height.length; i++) {
            int smaller = 0;
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] < height[j]) {
                    smaller = height[i];
                } else {
                    smaller = height[j];
                }
                int area = smaller * (j - i);
                if (area > maxarea) {
                    maxarea = area;
                }

            }
        }
        return maxarea;
    }
}

class Solution2 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}