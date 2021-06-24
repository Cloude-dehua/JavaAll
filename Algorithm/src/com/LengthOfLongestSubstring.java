package com;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;   //最长长度
        int left = 0;  //滑动窗口最初为零
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){      //如果包含，则更新left,
                left = Math.max(left,map.get(s.charAt(i)+1));
            }
            map.put(s.charAt(i),i);//更新left后，不管原来的 s.charAt(i) 是否在最长子段中，我们都要将 s.charAt(i) 的位置更新为当前的i，
            //如果包含了，则会把之前的给覆盖掉。
            max = Math.max(max,i-left+1);  //更新max
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s){
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            int cur = 0;   //每次都要清零整个HashMap表
            map.clear();
            for(int j = i;j<s.length();j++){
                if(map.containsKey(s.charAt(j))){   //遇到相同的则直接跳出循环
                    break;
                }
                map.put(s.charAt(j),j);
                cur++;
            }
            max = Math.max(max,cur);
        }
        return max;
    }
}
