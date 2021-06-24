package com;

public class LongestCommonPrefix {
    //方法一横向
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0 || strs == null){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1;i<strs.length;i++){
            prefix = longestCommonPrefix(prefix,strs[i]);
            if(prefix.length() == 0){
                return "";
            }

        }
        return prefix;
    }

    private String longestCommonPrefix(String str1, String str2) {
       int length = Math.min(str1.length(),str2.length());
        int index = 0;
        while(index<length && str1.charAt(index) == str2.charAt(index)){
            index++;
        }

        return str1.substring(0,index);
    }


   //方法二纵向扫描
    public String longestCommonPrefix2(String[] strs){

       if(strs == null || strs.length == 0){
           return  "";
       }
       String prefix = "";
       int length = strs[0].length();
       int count = strs.length;
       for(int i = 0;i<length;i++){   //表示第一个字符串的第i位
           char c = strs[0].charAt(i);
            for(int j = 1;j<count;j++){  //从第二个字符串开始纵向比较
                 if(i == strs[i].length() || strs[j].charAt(i) != c){
                     return strs[0].substring(0,i);
                 } //i == strs[i].length()用于判断后面的字符串的长度是否小于第一个，这样就可以提前结束
            }      //strs[j].charAt(i) != c不相等，直接结束。
       }
        return strs[0];
    }



    public static void main(String[] args) {
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] strs = {"deg","degh","deg"};
        System.out.println(l.longestCommonPrefix(strs));
    }
}
