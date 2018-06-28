package com.leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Atoi {
    public static int myAtoi(String str) {
        Integer result;
        str = str.trim();
        int num = str.length();
        for (int i = 1; i < str.length(); i++){

            if (!Character.isDigit(str.charAt(i))){
                num = i;
                break;
            }
        }
        str = str.substring(0, num);
        System.out.println(str);
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String a = e.getMessage();
            a = a.substring(19,a.length()-1);

            int resultTest = 0;
            int i = 0, len = a.length();
            boolean negative = false;
            int limit = Integer.MAX_VALUE;
            int multmin;
            int digit;
            int radix = 10;
            if (len > 0) {
                char firstChar = a.charAt(0);
                if(len==1){
                    return 0;
                }
                char secondChar = a.charAt(1);
                if (!Character.isDigit(secondChar)) return 0;
                if(!Character.isDigit(firstChar)){
                    if (firstChar == '-') {
                        negative = true;
                        limit = Integer.MIN_VALUE;
                    } else if (firstChar == '+') {

                    }else {
                        return 0;

                    }
                }
                    i++;
                    multmin = limit / radix;
                    while (i < len) {
                        digit = Character.digit(a.charAt(i++),radix);
                        if (resultTest < multmin) {
                            return limit;
                        }
                        resultTest *= radix;
                        if (resultTest < limit + digit) {
                            return limit;
                        }
                        resultTest -= digit;
                    }


            }

            return 0;
        }
        return result.intValue();
    }

    public static void main(String[] args) {
        String str = " b11228552307";
        System.out.println(new Atoi().myAtoi(str));

    }
}
