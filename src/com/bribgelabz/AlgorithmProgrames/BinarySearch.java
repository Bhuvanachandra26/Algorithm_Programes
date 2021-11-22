package com.bribgelabz.AlgorithmProgrames;

import java.util.Scanner;

/**
 * Read in the list words comma separated and then enter the word
   to be searched.
 */

public class BinarySearch {
    public static void main(String[] args) {
        String[] arr = {"Images", "Videos", "Albums", "Delete"};
            BinarySearch bs = new BinarySearch();
            bs.search(arr);
    }

    public void search(String[] str){
        int leftIndex = 0;
        int rightIndex = str.length - 1;
        String searchStr = "Delete";
        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            int res = searchStr.compareTo(str[midIndex]); 
            if(res == 0){
                System.out.println(searchStr + " Found");
                break;
            }else if(res > 0){
                leftIndex = midIndex + 1;
            }else if(res < 0) {
                rightIndex = midIndex - 1;
            }
        }
    }
}