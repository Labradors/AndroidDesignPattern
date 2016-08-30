package com.jiangtao.design.pattern.mvp;

import android.util.Log;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Class: LoadGithubPresenter <br>
 * Description:  <br>
 * Creator: kevin <br>
 * Date: 16/8/31 上午12:45 <br>
 * Update: 16/8/31 上午12:45 <br>
 */

public class LoadGithubPresenter
    implements LoadGithubContract.Presenter, LoadGithubContract.Presenter.DataStatus {

  public static final String TAG = LoadGithubPresenter.class.getSimpleName();
  private LoadGithubContract.View mView;

  public LoadGithubPresenter(LoadGithubContract.View varView) {
    mView = varView;
    Log.d(TAG, "LoadGithubPresenter: 初始化Presenter");
  }

  @Override public void loadGithubData(String userName) {
    Subscription s = GitHubApi.getContributors(userName)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(this::success, this::error);
  }

  @Override public void error( Throwable var) {
    Log.d(TAG, "error: "+var.getMessage());
    mView.error();
  }

  @Override public void success(Users varUsers) {
    mView.setUserName(varUsers.login);
    mView.setAvatar(varUsers.avatar_url);
  }
}
