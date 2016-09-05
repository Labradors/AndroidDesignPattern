package com.jiangtao.design.pattern.strategy;

/**
 * Created by kevin on 16/9/5.
 * 上下文环境
 */
public class SortContext {

  private SortAlgorithm mSortAlgorithm;

  public void setSortAlgorithm(SortAlgorithm varSortAlgorithm) {
    mSortAlgorithm = varSortAlgorithm;
  }

  public int[] sort(int[] arr){
    return mSortAlgorithm.sortArray(arr);
  }
}
