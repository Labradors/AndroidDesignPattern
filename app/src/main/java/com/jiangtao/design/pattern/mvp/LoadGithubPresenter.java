package com.jiangtao.design.pattern.mvp;

import android.util.Log;
import okhttp3.OkHttpClient;

/**
 * Created by kevin on 16/8/30.
 */

public class LoadGithubPresenter implements LoadGithubContract.Presenter {

  public static final String TAG = LoadGithubPresenter.class.getSimpleName();
  private LoadGithubContract.View mView;
  private OkHttpClient client = new OkHttpClient();

  public LoadGithubPresenter(LoadGithubContract.View varView){
    mView = varView;
    Log.d(TAG, "LoadGithubPresenter: 初始化Presenter");
  }

  @Override public void onLoadGithubStart() {
    //加载数据
  }

  @Override public void onLoadGithubComplete(Users topContributor) {
  }

  @Override public void start() {
    //初始化一些变量,显示变量
    Log.d(TAG, "start: 开始");
  }
}
