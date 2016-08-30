package com.jiangtao.design.pattern.mvp;

/**
 * Class: LoadGithubContract <br>
 * Description:  <br>
 * Creator: kevin <br>
 * Date: 16/8/30 下午9:24 <br>
 * Update: 16/8/30 下午9:24 <br>
 */

public interface LoadGithubContract {

  interface View extends BaseView<Presenter>{

    void setAvatar(String url);

    void setUserName(String name);
  }


  public interface Presenter extends BasePresenter{

    void onLoadGithubStart();

    void onLoadGithubComplete(Users topContributor);
  }

}
