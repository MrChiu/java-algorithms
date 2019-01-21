package com.example.sort;

/**
 * @author: qiudong
 * @description: 堆排序
 * 平均O(nlogn),
 * 最好O(nlogn),
 * 最坏O(nlogn);
 * 空间复杂度O(1);
 * 不稳定;较复杂
 * @date: Created in 15:47 2019-01-21
 */
public class HeapSort {

    private static void heapSort(int[] a) {
        int i;
        int len = a.length;
        // 构建堆，len / 2 - 1 是父节点的位置，i == 0是堆顶节点的位置
        for (i = len / 2 - 1; i >= 0; i--){
            heapAdjust(a, i, len-1);
        }
        //交换堆顶元素与最后一个元素的位置
        for (i = len - 1; i > 0; i--) {
            int tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            heapAdjust(a, 0, i - 1);
        }
    }

    private static void heapAdjust(int[] a, int pos, int len) {
        int childIndex = 2 * pos + 1;//左孩子下标
        int tmp = a[pos];//父节点
        while (childIndex <= len) {
            if (childIndex < len && a[childIndex] < a[childIndex + 1]){
                childIndex++;//取右孩子下标
            }
            if (a[childIndex] > tmp) {
                a[pos] = a[childIndex];
                pos = childIndex;
                childIndex = 2 * pos + 1;
            } else{
                break;
            }
        }
        a[pos] = tmp;
    }

    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50, 51, 22, 31, 76, 10, 6, 1, 100 };
        heapSort(a);
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}
