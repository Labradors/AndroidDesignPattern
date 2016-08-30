package com.jiangtao.design.pattern.mvp;

/**
 * Class: BaseView <br>
 * Description:  设置Presenter<br>
 * Creator: kevin <br>
 * Date: 16/8/30 下午9:20 <br>
 * Update: 16/8/30 下午9:20 <br>
 */

public interface BaseView<T>{

  public void setPresenter(T presenter);
}
