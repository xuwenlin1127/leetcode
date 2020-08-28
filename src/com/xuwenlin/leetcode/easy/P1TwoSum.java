package com.xuwenlin.leetcode.easy;

import java.util.HashMap;

public class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // TO TEST
    }
}

/**
 * 暴力破解
 * 优化：可以利用哈希来减少时间复杂度（用空间换时间）
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1、暴力破解
        /*for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i,j};
                }

            }
        }
        throw new IllegalArgumentException("No two sum solution");*/
        //2、优化：可以利用哈希来减少时间复杂度（用空间换时间）
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = target - nums[i];
            if(map.containsKey(val)){
                return new int[]{map.get(val),i};
            }map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}