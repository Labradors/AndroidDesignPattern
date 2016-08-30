package com.jiangtao.design.pattern.mvp;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Class: GitHubApi <br>
 * Description:  构建api<br>
 * Creator: kevin <br>
 * Date: 16/8/30 下午11:40 <br>
 * Update: 16/8/30 下午11:40 <br>
 */

public class GitHubApi {

  public static Observable<Users> getContributors(String name) {
    Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.github.com")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .build();

    GitHubService service = retrofit.create(GitHubService.class);
    return service.repoContributors(name);
  }
}
