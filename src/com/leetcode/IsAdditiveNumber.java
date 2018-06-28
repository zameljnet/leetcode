package com.leetcode;

public class IsAdditiveNumber {
    /*
    public boolean isAdditiveNumber(String num) {
        boolean result=false;
        boolean resultTest = false;
        int length = num.length();
        if (length % 2 == 0) {
            length = length / 2;
        } else {
            length = length / 2 + 1;
        }

        System.out.println("length is "+length);
        int countLength = length;
        int thirdLength = 0;
        String firstStr="";
        String secondStr="";
        String thirdStr="";
        int firstInteger;
        int secondInteger;
        int thirdInteger;
        for (int i = 1; i <length; i++) {
            System.out.println("i is " + i);
            firstStr = num.substring(0, i);
            firstInteger = Integer.parseInt(firstStr);
            for (int j = 1; j <= countLength-i; j++) {
                secondStr = num.substring(i, i + j);
                secondInteger = Integer.parseInt(secondStr);
                thirdLength = Math.max(i, j);
                thirdStr = num.substring(j + 1, j + 1 + thirdLength);
                thirdInteger = Integer.parseInt(thirdStr);
                if (thirdInteger ==firstInteger+secondInteger) resultTest = resultTest|| true;
                if (resultTest) {
                    isAdditive(num);
                }
                System.out.println("firstInteger is "+firstInteger);
                System.out.println("secondInteger is "+secondInteger);
                System.out.println("thirdInteger is "+thirdInteger);
            }

        }

        return result;
    }
    */
    public boolean isAdditive(String num, int length) {
        int lengthTest = num.length();
        if (lengthTest % 2 == 0) {
            lengthTest = lengthTest / 2;
        } else {
            lengthTest = lengthTest / 2 + 1;
        }

        System.out.println(num);
        System.out.println(num.length());
        boolean result=true;
        String firstStr="";
        String secondStr="";
        String thirdStr="";
        int firstInteger;
        int secondInteger;
        int thirdInteger;
        int thirdIntegerInString;
        int strLength = 1;
        int firstLength = 1;
        int secondLength = 1;
        int thirdLength = 1;
        int i = 0;
        while (i<=lengthTest+thirdLength) {
            System.out.println("i is " + i);
            firstInteger = Integer.parseInt(num.substring(i, i+firstLength));
            secondInteger = Integer.parseInt(num.substring(i+firstLength, i+firstLength+strLength));
            System.out.println("firstInteger "+firstInteger);
            System.out.println("secondInteger "+secondInteger);
            thirdInteger = firstInteger + secondInteger;
            System.out.println("thirdInteger " + thirdInteger);
            thirdLength = (thirdInteger + "").length();
            if (i+firstLength+strLength+thirdLength>num.length()){
                thirdIntegerInString = Integer.parseInt(num.substring(i+firstLength+strLength, num.length()));
            }else thirdIntegerInString = Integer.parseInt(num.substring(i+firstLength+strLength, i+firstLength+strLength + thirdLength));
            System.out.println(thirdIntegerInString);
            strLength = Math.min((secondInteger + "").length(), Math.min((firstInteger + "").length(), thirdLength));
            strLength = secondLength= thirdLength;
            firstLength  = (secondInteger + "").length();
            i=i+Math.min((secondInteger + "").length(), Math.min((firstInteger + "").length(), thirdLength));
            if (thirdInteger != thirdIntegerInString) {
                result = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "134711182947761231993225";
        System.out.println(new IsAdditiveNumber().isAdditive(str, 1));
        //System.out.println(new IsAdditiveNumber().isAdditiveNumber(str));
    }

}
