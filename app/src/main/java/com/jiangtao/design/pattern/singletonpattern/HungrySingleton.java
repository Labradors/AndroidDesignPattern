package com.jiangtao.design.pattern.singletonpattern;

/**
 * Class: HungrySingleton <br>
 * Description: 懒汉模式 <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午5:03 <br>
 * Update: 16/8/28 下午5:03 <br>
 */

public class HungrySingleton {

  private static HungrySingleton mHungrySingleton = new HungrySingleton();

  private HungrySingleton(){}

  public static HungrySingleton getInstance(){
    return mHungrySingleton;
  }
}
