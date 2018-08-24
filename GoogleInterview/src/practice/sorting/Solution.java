package practice.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	
    public List<List<Integer>> threeSum(int[] nums) {
    	 List<Integer> list=new ArrayList<Integer>(); 
    	 List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    if(0== (nums[i]+nums[j]+nums[k])) {  
                   // 	System.out.println(" "+nums[i]+" "+nums[j]+" "+nums[k]);
                         	
                    	list.add(nums[i]);
                    	list.add(nums[j]);
                    	list.add(nums[k]);
                     result.add(list);
                    }
                }
            } 
          
        }
		return result;
    } 
    public static void main(String arg[]) {
    int []	nums = {-1, 0, 1, 2, -1, -4}; 
    Solution s=new Solution();
    List<List<Integer>> lst=s.threeSum(nums); 
    System.out.println(lst);
    
    }
}