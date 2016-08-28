package com.jiangtao.design.pattern.singletonpattern;

/**
 * Class: InnerClassSingleton <br>
 * Description: 静态内部类实现单例 <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午5:25 <br>
 * Update: 16/8/28 下午5:25 <br>
 */

public class InnerClassSingleton {

  private InnerClassSingleton(){}

  public static InnerClassSingleton getInstance(){
    return SingletonHolder.sInstance;
  }

  private static class SingletonHolder{
    private static final InnerClassSingleton sInstance = new InnerClassSingleton();
  }
}
