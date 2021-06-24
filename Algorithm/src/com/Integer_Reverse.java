package com;

public class Integer_Reverse {
    public int Reserve(int x){
        int ret = 0;
        while(x != 0){
            if(ret>Integer.MAX_VALUE/10 || ret<Integer.MIN_VALUE/10){
                return 0;
            }
            ret = ret*10 + x%10;
            x = x/10;
        }
        return ret;
    }

    public static void main(String[] args) {
        Integer_Reverse integer_reverse = new Integer_Reverse();
        System.out.println( integer_reverse.Reserve(-2147483412));


    }
}
