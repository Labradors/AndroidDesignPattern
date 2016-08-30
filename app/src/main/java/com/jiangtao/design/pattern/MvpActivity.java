package com.jiangtao.design.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jiangtao.design.pattern.mvp.LoadGithubContract;
import com.jiangtao.design.pattern.mvp.LoadGithubPresenter;

/**
 * Class: MvpActivity <br>
 * Description: MVP价格 <br>
 * Creator: kevin <br>
 * Date: 16/8/30 下午8:29 <br>
 * Update: 16/8/30 下午8:29 <br>
 */
public class MvpActivity extends AppCompatActivity implements LoadGithubContract.View {

  public static final String TAG = MvpActivity.class.getSimpleName();
  
  private SimpleDraweeView mSimpleDraweeView;
  private TextView mTextView;
  private LoadGithubContract.Presenter mPresenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_mvp);
    mSimpleDraweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
    mTextView = (TextView) findViewById(R.id.my_name_view);
    Log.d(TAG, "onCreate: 创建");
    mPresenter = new LoadGithubPresenter(MvpActivity.this);
  }

  @Override protected void onResume() {
    super.onResume();
    mPresenter.start();
    Log.d(TAG, "onResume: 启动Presenter");
  }

  @Override public void setAvatar(String url) {
    mSimpleDraweeView.setImageURI(url);
    Log.d(TAG, "setAvatar: 设置url");
  }

  @Override public void setUserName(String name) {
    mTextView.setText(name);
    Log.d(TAG, "setUserName: 设置name");
  }

  @Override public void setPresenter(LoadGithubContract.Presenter presenter) {
    mPresenter = new LoadGithubPresenter(MvpActivity.this);
    Log.d(TAG, "setPresenter: ");
  }
}
