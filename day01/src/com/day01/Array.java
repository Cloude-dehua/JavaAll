package com.day01;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的值");
        System.out.println(sc.nextInt());

        int[] arr = new int[]{1,2,4};
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
