package com.jiangtao.design.pattern.strategy;

/**
 * Created by kevin on 16/9/5.
 * 插入排序
 */
public class InsertSort implements SortAlgorithm {
  @Override public int[] sortArray(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j - 1] <= arr[j]) break;
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
      }
    }
    return arr;
  }
}
