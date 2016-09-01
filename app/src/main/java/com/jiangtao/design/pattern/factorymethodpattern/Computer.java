package com.jiangtao.design.pattern.factorymethodpattern;

/**
 * Class: Computer <br>
 * Description: 电脑属于产品类的一种 <br>
 * Creator: kevin <br>
 * Date: 16/9/1 下午9:38 <br>
 * Update: 16/9/1 下午9:38 <br>
 */

public class Computer extends Product {
  @Override public String read() {
    return "你就说我6不6.";
  }

  @Override public String write() {
    return "我很666666";
  }
}
