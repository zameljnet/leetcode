package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

    public static int reverse(int x) {
        if(x > 2147483647 || x < -2147483647-1){
            return 0;
        }
        int result = 0;
        List<Integer> a = new ArrayList<>();
            while(x%10 != x){
                a.add(x % 10);
                x = x - (x % 10);
                x = x/10;
            }
            a.add(x);
            int numTest;
            int size = a.size();
            for (Integer b : a) {
                int c = b.intValue();
                numTest = size;
                while(numTest-1>0) {
                    if (c > 2147483647/10 || c < -2147483647/10) {
                        return 0;
                    }
                    c = c*10;
                    numTest--;

                }
                size--;
                if(c>0){
                    if (result> 2147483647-c || result+c <-2147483647-1) {
                        return 0;
                    }
                }else {
                    if (result+c> 2147483647 || result <-2147483647-1-c) {
                        return 0;
                    }
                }

                result += c;
            }
        return result;
    }

    public static void main(String[] args) {
        int a =  123;
        int c =  2147483412;
        int b= reverse(a);
        System.out.println(b);
    }
}
