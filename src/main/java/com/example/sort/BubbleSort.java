package com.example.sort;

/**
 * @author: qiudong
 * @description: 冒泡排序
 * 平均O(n^2),
 * 最好O(n),
 * 最坏O(n^2);
 * 空间复杂度O(1);
 * 稳定;简单
 * @date: Created in 15:34 2019-01-21
 */
public class BubbleSort {

    private static void bubbleSort(int[] a){
        int n = a.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]<a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] a ={49,38,65,97,76,13,27,50};
        bubbleSort(a);
        for(int j : a){
            System.out.print(j+" ");
        }
    }
}
