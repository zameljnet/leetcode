package com.leetcode;


import sun.reflect.generics.tree.Tree;

public class Model {
    private int leastNum = Integer.MAX_VALUE;

    public int numSquares(int n) {
        if (n < 3) {
            return leastNum = n;
        }
        getSum(n);
        return leastNum;
    }

    private int getSum( int n ) {
        if (n < 3) {
            return leastNum = n;
        }
        int length = (int) Math.sqrt(n);
        for (int i = length; i >length/2 ; i--) {
            if (n % (i*i) == 0 && n!=1) {
                leastNum = Math.min(leastNum,n / (i * i));
                System.out.println(leastNum);
                if (leastNum<4) return leastNum;
            }
        }
        for (int i = length; i >length/2; i--) {
            leastNum=Math.min(leastNum,1+getSum(n - i * i));
            if (leastNum < 3) {
                break;
            }
        }
        return leastNum;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(n);
        System.out.println(new NumSquares().numSquares(n));
    }
}
