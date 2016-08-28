package com.jiangtao.design.pattern.builder.book;

/**
 * Class: MacBook <br>
 * Description: Mac <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午6:25 <br>
 * Update: 16/8/28 下午6:25 <br>
 */

public class MacBook extends Computer {

  protected MacBook(){}

  @Override public void setOs() {
    mOs = "Mac OSX";
  }
}
