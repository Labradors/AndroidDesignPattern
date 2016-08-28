package com.jiangtao.design.pattern.builder.book;

/**
 * Class: MacBookBuilder <br>
 * Description: Mac Builder <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午6:31 <br>
 * Update: 16/8/28 下午6:31 <br>
 */

public class MacBookBuilder extends Builder {

  private Computer mComputer = new MacBook();

  @Override public void buildBoard(String board) {
    mComputer.setBoard(board);
  }

  @Override public void buildDisplay(String display) {
    mComputer.setDisplay(display);
  }

  @Override public void buildOS() {
    mComputer.setOs();
  }

  @Override public Computer create() {
    return mComputer;
  }
}
