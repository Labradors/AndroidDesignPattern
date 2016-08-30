package com.jiangtao.design.pattern.mvp;

/**
 * Class: Users <br>
 * Description: github user model <br>
 * Creator: kevin <br>
 * Date: 16/8/30 下午9:43 <br>
 * Update: 16/8/30 下午9:43 <br>
 */

public class Users {

  public String login;
  public String avatar_url;

  public Users(String varLogin, String varAvatar_url) {
    login = varLogin;
    avatar_url = varAvatar_url;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String varLogin) {
    login = varLogin;
  }

  public String getAvatar_url() {
    return avatar_url;
  }

  public void setAvatar_url(String varAvatar_url) {
    avatar_url = varAvatar_url;
  }
}
