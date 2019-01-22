package com.example.sort;

/**
 * @author: qiudong
 * @description: 快速排序
 * 平均O(nlogn),
 * 最好O(nlogn),
 * 最坏O(n^2);
 * 空间复杂度O(nlogn);
 * 不稳定;较复杂
 * @date: Created in 15:34 2019-01-21
 */
public class QuickSort {

    private static void sort(int[] a, int low, int high) {
        if(low>=high)
            return;
        int i = low;
        int j = high;
        //选择第一个元素为基准
        int key = a[i];
        while (i < j) {
            //循环高位，遇到大于等于基准值的停下
            while (i < j && a[j] >= key) j--;

            a[i++] = a[j];
            //
            while (i < j && a[i] <= key) i++;
            a[j--] = a[i];
        }
        a[i] = key;
        sort(a,low,i-1);
        sort(a,i+1,high);
    }

    private static void quickSort(int[] a) {
        sort(a, 0, a.length-1);
        for(int i:a) System.out.print(i+" ");
    }

    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        quickSort(a);
    }
}
