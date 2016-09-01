package com.jiangtao.design.pattern.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jiangtao.design.pattern.R;
import com.jiangtao.design.pattern.mvp.LoadGithubContract;
import com.jiangtao.design.pattern.mvp.LoadGithubPresenter;

/**
 * Class: MvpActivity <br>
 * Description: MVP架构 <br>
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
    mPresenter = new LoadGithubPresenter(MvpActivity.this);
  }

  @Override protected void onResume() {
    super.onResume();
    mPresenter.loadGithubData("jiangTaoQuite");
  }

  @Override public void setAvatar(String url) {
    mSimpleDraweeView.setImageURI(url);
  }

  @Override public void setUserName(String name) {
    mTextView.setText(name);
  }

  @Override public void error() {
    Toast.makeText(this,"获取数据错误",Toast.LENGTH_LONG).show();
  }
}
