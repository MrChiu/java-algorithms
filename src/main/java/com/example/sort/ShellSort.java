package com.example.sort;

/**
 * @author: qiudong
 * @description: 希尔排序
 * 平均O(nlogn),
 * 最坏O(nlogn);
 * 空间复杂度O(1);
 * 不稳定;较复杂
 * @date: Created in 13:39 2019-01-22
 */
public class ShellSort {

    private static void shellSort(int[] a) {
        int n = a.length;
        int d = n / 2;
        while (d > 0) {
            for (int i = d; i < n; i++) {
                int j = i - d;
                while (j >= 0 && a[j] > a[i]) {
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                    j = j - d;
                }
            }
            d = d / 2;
        }
    }

    public static void main(String[] args) {
        int[] b = { 49, 38, 65, 97, 76, 13, 27, 50 };
        shellSort(b);
        for (int i : b)
            System.out.print(i + " ");
    }
}
