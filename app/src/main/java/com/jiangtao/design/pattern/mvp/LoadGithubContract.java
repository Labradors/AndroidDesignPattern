package com.jiangtao.design.pattern.mvp;

/**
 * Class: LoadGithubContract <br>
 * Description:  <br>
 * Creator: kevin <br>
 * Date: 16/8/30 下午9:24 <br>
 * Update: 16/8/30 下午9:24 <br>
 */

public interface LoadGithubContract {

  interface View {

    void setAvatar(String url);

    void setUserName(String name);

    void error();
  }


  public interface Presenter {

    void loadGithubData(String userName);

    interface DataStatus{

      void error(Throwable varThrowable);

      void success(Users varUsers);
    }
  }

}
