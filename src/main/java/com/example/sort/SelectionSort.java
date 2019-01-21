package com.example.sort;

/**
 * @author: qiudong
 * @description: 选择排序
 * 平均O(n^2),
 * 最好O(n^2),
 * 最坏O(n^2);
 * 空间复杂度O(1);
 * 不稳定;简单
 * @date: Created in 15:28 2019-01-21
 */
public class SelectionSort {

    private static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            // 找出最小值的下标
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            // 将最小值放到未排序记录的第一个位置
            if (k > i) {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] b = { 49, 38, 65, 97, 76, 13, 27, 50 };
        selectionSort(b);
        for (int i : b){
            System.out.print(i + " ");
        }
    }

}
