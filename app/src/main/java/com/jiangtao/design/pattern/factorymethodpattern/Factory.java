package com.jiangtao.design.pattern.factorymethodpattern;

/**
 * Class: Factory <br>
 * Description: 抽象工厂类 <br>
 * Creator: kevin <br>
 * Date: 16/9/1 下午9:34 <br>
 * Update: 16/9/1 下午9:34 <br>
 */

public abstract class Factory {

  public abstract <T extends Product> T createProduct(Class<T> clz);
}
