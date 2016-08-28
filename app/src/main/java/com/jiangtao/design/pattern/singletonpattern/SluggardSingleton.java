package com.jiangtao.design.pattern.singletonpattern;

/**
 * Class: SluggardSingleton <br>
 * Description: 懒汉模式 <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午5:09 <br>
 * Update: 16/8/28 下午5:09 <br>
 */

public class SluggardSingleton {

  private static SluggardSingleton mSluggardSingleton;

  private SluggardSingleton(){}

  public static synchronized SluggardSingleton getInstance(){
    if (mSluggardSingleton==null){
      mSluggardSingleton = new SluggardSingleton();
    }
    return mSluggardSingleton;
  }
}
