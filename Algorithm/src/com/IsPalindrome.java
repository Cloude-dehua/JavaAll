package com;

public class IsPalindrome {
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }else{
            int y = x,temp = 0;
            while(y>0){
                temp = temp*10 + y%10;
                y /= 10;
            }
           return x==temp?true:false;
        }
    }


    public boolean isPalindrome2(int x){
        if(x<0){
            return false;
        }else{
            String str = x + "";
            int l = str.length();
            for(int i = 0;i<l/2;i++){
                if(str.charAt(i) != str.charAt(l-i-1)){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome2(121));

    }
}
