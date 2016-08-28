package com.jiangtao.design.pattern.singletonpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Class: ContainerSingleton <br>
 * Description: 容器实现单例与管理单例 <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午5:31 <br>
 * Update: 16/8/28 下午5:31 <br>
 */

public class ContainerSingleton {

  private static Map<String,Object> objMap = new HashMap<>();

  private ContainerSingleton(){}

  public static void registerService(String key,Object instance){
    if (!objMap.containsKey(key)){
      objMap.put(key,instance);
    }
  }

  public static Object getService(String key){
    return objMap.get(key);
  }
}
