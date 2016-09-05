package com.jiangtao.design.pattern.strategy;

/**
 * Created by kevin on 16/9/5.
 * 冒泡排序
 */
public class BubbleSort implements SortAlgorithm {

  @Override public int[] sortArray(int[] arr) {
    int i, j, temp, len = arr.length;
    for (i = 0; i < len - 1; i++)
      for (j = 0; j < len - 1 - i; j++)
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
    return arr;
  }
}
