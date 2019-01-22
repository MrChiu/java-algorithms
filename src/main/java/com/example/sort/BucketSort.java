package com.example.sort;

/**
 * @author: qiudong
 * @description: 桶排序
 * @date: Created in 17:00 2019-01-22
 */
public class BucketSort {

    private static int[] bucketSort(int[] array,int maxNumber) {
        int[] newArray = new int[maxNumber + 1];
        for(int i=0; i<array.length; i++) {
            newArray[array[i]] = array[i];
        }
        return newArray;
    }
    // 打印功能
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if(arr[x] >0) {
                System.out.print(arr[x]+" ");
            }
        }
        System.out.println("]");
    }

    public static void main (String[] args) throws java.lang.Exception{
        int[] Array = { 99, 65, 24, 47, 50, 88,33, 66, 67, 31, 18 };
        int[] newArray = bucketSort(Array,99);
        printArray(newArray);
    }

}
