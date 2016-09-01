package com.jiangtao.design.pattern.factorymethodpattern;

/**
 * Class: SingleFactory <br>
 * Description:  只有一个实例的工厂类<br>
 * Creator: kevin <br>
 * Date: 16/9/1 下午9:42 <br>
 * Update: 16/9/1 下午9:42 <br>
 */
// TODO: 16/9/1 这多没意思
public class SingleFactory {

  public static Product createProduct(){
    return new Computer();
  }
}
