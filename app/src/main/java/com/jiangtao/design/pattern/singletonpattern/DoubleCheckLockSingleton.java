package com.jiangtao.design.pattern.singletonpattern;

/**
 * Class: DoudleCheckLockSingleton <br>
 * Description:  双重检查锁<br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午5:16 <br>
 * Update: 16/8/28 下午5:16 <br>
 */

public class DoubleCheckLockSingleton {

  private volatile static DoubleCheckLockSingleton mDoubleCheckLockSingleton;

  private DoubleCheckLockSingleton(){}

  public static DoubleCheckLockSingleton getInstance(){
    if (mDoubleCheckLockSingleton==null){
      synchronized (DoubleCheckLockSingleton.class){
        if (mDoubleCheckLockSingleton==null){
          mDoubleCheckLockSingleton = new DoubleCheckLockSingleton();
        }
      }
    }
    return mDoubleCheckLockSingleton;
  }
}
