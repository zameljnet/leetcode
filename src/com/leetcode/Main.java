package com.leetcode;


import com.sun.istack.internal.localization.NullLocalizable;

import java.util.*;
import java.util.ArrayList;
public class Main {
        public static int minNumberInRotateArray(int [] array) {
                if(array.length == 0 || array == null){
                        return 0;
                }
                int index1 = 0;
                int index2 = array.length-1;
                //第一个点
                int midIndex = index1;

                if(array[midIndex] > array[index1] && array[index2] >array[midIndex]){
                        return array[0];
                }
                while(array[index1] >= array[index2]){
                        if(index2 - index1 == 1){
                                midIndex = index2;
                                break;
                        }
                        //第二个点
                        midIndex = (index1 + index2)/2;
                        //第三个点 ，调位置
                        if(array[index1] == array[index2] && array[midIndex] == array[index1]){
//                Solution solution = new Solution();
                                return orderSearch(array);
                        }
                        //第四个点，index1放前面判断，index2放后面
                        if ( array[midIndex] >= array[index1]){
                                index1 = midIndex;
                        } else if(array[midIndex] <= array[index2]){
                                index2 = midIndex;
                        }
                }
                return array[midIndex];
        }
        public  static int orderSearch(int[] array){
                int min = array[0];
                for(int i = 1;i < array.length ;i++){
                        // if(array[i] < min){
                        min = Math.min(min, array[i]);
                        //}
                }
                return min;
        }

        public static void main(String[] args) {
                int []array = {4,5,6,1,2,3};
                int a = minNumberInRotateArray(array);
                System.out.println(a);


        }
}






