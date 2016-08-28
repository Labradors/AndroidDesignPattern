package com.jiangtao.design.pattern.builder.book;

/**
 * Class: Builder <br>
 * Description: 抽象构建类 <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午6:27 <br>
 * Update: 16/8/28 下午6:27 <br>
 */

public abstract class Builder {

  public abstract void buildBoard(String board);

  public abstract void buildDisplay(String display);

  public abstract void buildOS();

  public abstract Computer create();

}
