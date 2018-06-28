package com.leetcode;

public class Effectiveness {
    public static void main(String[] args) {
        char D = 65;
        System.out.println((int) 'I');
        int status = 10;
        long formerDate = System.nanoTime();
        if (status == 0) {
            System.out.println(0);
        } else if (status == 1) {
            System.out.println(1);
        } else if (status == 2) {
            System.out.println(2);
        } else
            System.out.println("Error");
        long latterDate = System.nanoTime();
        long delay = (latterDate - formerDate)/1000;
        System.out.println("delay is " +delay+"ms");
        int status_switch = 10;
        long formerDate_switch = System.nanoTime();
        switch (status_switch) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("Error");
        }
        long latterDate_switch = System.nanoTime();
        long delay_switch = (latterDate_switch - formerDate_switch)/1000;
        System.out.println("delay_switch is " +delay_switch+"ms");

        int max;
        int num1 = 10;
        int num2 = 13;
        long formerDate_1 = System.nanoTime();
        max = (num1 > num2) ? num1 : num2;
        long latterDate_1 = System.nanoTime();
        long delay_1 = (latterDate_1 - formerDate_1)/1000;
        System.out.println("delay_1 is " +delay_1+" ms");
        long formerDate_2 = System.nanoTime();
        max = Math.max(num1, num2);
        long latterDate_2 = System.nanoTime();
        long delay_2 = (latterDate_2 - formerDate_2)/1000;
        System.out.println("delay_2 is " +delay_2+" ms");
        long formerDate_3 = System.nanoTime();
        if (num1>num2) {
            max = num1;
        } else max = num2;
        long latterDate_3 = System.nanoTime();
        long delay_3 = (latterDate_3 - formerDate_3)/1000;
        System.out.println("delay_3 is " +delay_3+" ms");

        String str1 = "abcdddddddccccccccccccccccccccccccccccccccccccccccccAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        String str2 = "abcdddddddccccccccccccccccccccccccccccccccccccccccccAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        long formerDate_4 = System.nanoTime();
        String str3 = str1.concat(str2);
        long latterDate_4 = System.nanoTime();
        long delay_4 = (latterDate_4 - formerDate_4)/1000;
        System.out.println("delay_4 is " +delay_4+" ms");
        long formerDate_5 = System.nanoTime();
        String str4 = str1 + str2;
        long latterDate_5 = System.nanoTime();
        long delay_5 = (latterDate_5 - formerDate_5)/1000;
        System.out.println("delay_5 is " +delay_5+" ms");

    }
}
