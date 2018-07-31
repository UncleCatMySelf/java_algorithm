package com.myself.algorithm.sort;

/**
 * 选择排序
 * @Author:UncleCatMySelf
 * @Email：zhupeijie_java@126.com
 * @QQ:1341933031
 * @Date:Created in 11:42 2018\7\31 0031
 */
public class SelectionSort {

    //对于算法类不允许任何实例
    private SelectionSort(){}

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length ; i++){
            //寻找[i,n)区间里的最小值
            int minIndex = i;
            for (int j = i+1;j < arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            //交互数据
            swap(arr, i, minIndex);
        }
    }

    //交换数据
    private static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }

}
