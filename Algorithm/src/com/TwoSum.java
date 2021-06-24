package com;

import java.util.HashMap;

class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];        //创建一个result数组
        for (int i = 0; i < nums.length; i++) {       //两层循环暴力枚举求解
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {   //判断是否符合题目要求
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;           //返回数组
    }

    //key-value:其中key存的是nums数组中的值，value存的是对应值的下标
    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];       //创建一个结果数组
        HashMap<Integer, Integer> map = new HashMap<>(); //创建一个HashMap表
        map.put(nums[0], 0);   //因为数组的第一个值一定没有与之相同的值
        for (int i = 1; i < nums.length; i++) {
             if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
       TwoSum twoSum = new TwoSum();
       int[] a = new int[]{1,2,34};
       twoSum.twoSum(a,36);
    }
}
