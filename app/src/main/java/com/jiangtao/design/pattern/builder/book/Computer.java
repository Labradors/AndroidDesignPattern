package com.jiangtao.design.pattern.builder.book;

/**
 * Class: Computer <br>
 * Description: 抽象电脑类 <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午6:22 <br>
 * Update: 16/8/28 下午6:22 <br>
 */
public abstract class Computer {

  protected String mBoard;
  protected String mDisplay;
  protected String mOs;

  protected Computer(){}

  public abstract void setOs();

  public void setBoard(String varBoard) {
    mBoard = varBoard;
  }

  public void setDisplay(String varDisplay) {
    mDisplay = varDisplay;
  }

  @Override public String toString() {
    return "Computer{" +
        "mBoard='" + mBoard + '\'' +
        ", mDisplay='" + mDisplay + '\'' +
        ", mOs='" + mOs + '\'' +
        '}';
  }
}
