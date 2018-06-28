package com.leetcode;

import org.omg.CORBA.CharSeqHolder;

public class FindComplement {
    public int findComplement(int num) {
        int result;
        String binaryString = Integer.toBinaryString(num);
        String resultString="";
        for (int i = 0; i < binaryString.length(); i++) {
            char charInString = binaryString.charAt(i);
            if (charInString == '1') {
                charInString = '0';
            } else if (charInString == '0') {
                charInString = '1';
            }
            resultString+=charInString;
        }
        result = Integer.parseInt(resultString,2);
        return result;
    }
    public static void main(String[] args) {
        int a = 5;
        FindComplement findComplement = new FindComplement();
        System.out.println(findComplement.findComplement(a));

    }
}
