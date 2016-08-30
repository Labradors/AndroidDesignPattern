package com.jiangtao.design.pattern.mvp;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Class: GitHubService <br>
 * Description: github service <br>
 * Creator: kevin <br>
 * Date: 16/8/30 下午11:41 <br>
 * Update: 16/8/30 下午11:41 <br>
 */

public interface GitHubService {

  @GET("/users/{username}") Observable<Users> repoContributors(
      @Path("username") String name);
}
