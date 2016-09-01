package com.jiangtao.design.pattern.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.jiangtao.design.pattern.R;

/**
 * Class: FactoryActivity <br>
 * Description:  工厂模式案例<br>
 * Creator: kevin <br>
 * Date: 16/9/1 下午10:40 <br>
 * Update: 16/9/1 下午10:40 <br>
 */
public class FactoryActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_factory);
  }
}
