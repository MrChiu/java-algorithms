package com.example.sort;

/**
 * @author: qiudong
 * @description: 归并排序
 * 平均O(nlogn),
 * 最好O(nlogn),
 * 最坏O(nlogn);
 * 空间复杂度O(n);
 * 稳定;较复杂
 * @date: Created in 15:34 2019-01-21
 */
public class MergeSort {

    //两路归并算法，两个排好序的子序列合并为一个子序列
    private static void merge(int[] a, int start, int mid, int end) {
        //辅助数组
        int[] tmp = new int[a.length];
        System.out.println("merge " + start + "~" + end);
        //p1、p2是检测指针，k是存放指针
        int p1 = start, p2 = mid + 1, k = start;

        while (p1<=mid && p2<=end) {
            if (a[p1] < a[p2])
                tmp[k++] = a[p1++];
            else
                tmp[k++] = a[p2++];
        }
        //如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while (p1 < mid + 1) tmp[k++] = a[p1++];
        //同上
        while (p2 < end + 1) tmp[k++] = a[p2++];

        //复制回原数组
        for (p1 = start; p1 <= end; p1++)
            a[p1] = tmp[p1];
        //打印
        for (int p : a)
            System.out.print(p + " ");
        System.out.println();
    }

    private static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            // 左边有序
            mergeSort(a, start, mid);
            // 右边有序
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] b = { 49, 38, 65, 97, 76, 13, 27, 50 };
        mergeSort(b, 0, b.length - 1);
    }
}
