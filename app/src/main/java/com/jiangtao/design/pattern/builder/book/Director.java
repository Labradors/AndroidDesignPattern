package com.jiangtao.design.pattern.builder.book;

/**
 * Class: Director <br>
 * Description:  用来构建computer<br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午6:35 <br>
 * Update: 16/8/28 下午6:35 <br>
 */

public class Director {

  Builder mBuilder = null;

  public Director(Builder builder){
    this.mBuilder = builder;
  }

  public void construct(String board,String display){
    mBuilder.buildBoard(board);
    mBuilder.buildDisplay(display);
    mBuilder.buildOS();
  }
}
