package com.jiangtao.design.pattern.factorymethodpattern;

/**
 * Class: ComputerFactory <br>
 * Description:  电脑工厂类<br>
 * Creator: kevin <br>
 * Date: 16/9/1 下午9:40 <br>
 * Update: 16/9/1 下午9:40 <br>
 */

public class ComputerFactory extends Factory {
  @Override public <T extends Product> T createProduct(Class<T> clz) {
    Product p = null;
    try {
      p = (Product) Class.forName(clz.getName()).newInstance();
    }catch (Exception e){
      e.printStackTrace();
    }
    return (T)p;
  }
}
