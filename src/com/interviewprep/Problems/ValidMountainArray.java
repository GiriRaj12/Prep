package com.interviewprep.Problems;

public class ValidMountainArray {

    /**
     * Given an array of integers arr, return true if and only if it is a valid mountain array.
     *
     * Recall that arr is a mountain array if and only i
     *
     */


    public static void main(String[] args) {
        int [] mountainArr = new int[]{2, 1};
        System.out.println(checkValidMountain(mountainArr));
    }

    public static boolean checkValidMountain(int arr []){
        boolean peak = false;
        boolean one = false;
        boolean two = false;


        for(int i=0; i< arr.length - 1; i++){

            if(arr[i] == arr[i + 1])
                return false;

            if(!peak && arr[i] > arr[i + 1]){
                peak = true;
            }

            if(!peak && arr[i] < arr[i + 1]) {
                one = true;
                continue;
            }

            if(peak && arr[i] > arr[i + 1]) {
                two = true;
                continue;
            }

            return false;
        }

        return one && two;
    }
}
