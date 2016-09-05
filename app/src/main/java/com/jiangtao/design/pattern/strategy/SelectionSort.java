package com.jiangtao.design.pattern.strategy;

/**
 * Created by kevin on 16/9/5.
 * 选择排序
 */
public class SelectionSort implements SortAlgorithm {

  @Override public int[] sortArray(int[] arr) {
    int i, j, min, temp, len = arr.length;
    for (i = 0; i < len - 1; i++) {
      min = i;
      for (j = i + 1; j < len; j++)
        if (arr[min] > arr[j]) min = j;
      temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }
}
