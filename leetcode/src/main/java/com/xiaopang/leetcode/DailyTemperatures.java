package com.xiaopang.leetcode;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] dailyTemperatures = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        for (int i: dailyTemperatures) {
            System.out.println(i);
        }
    }
    public static int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] nums = new int[length];
         for (int i = 0; i< length; i++) {
             nums[i] = 0;
             loop: for (int j = i+1; j< length; j++) {
                int ti = T[i];
                int ji = T[j];
                if (ti<ji) {
                    nums[i] = j-i;
                    break loop;
                }
            }
        }
        return nums;
    }
}
