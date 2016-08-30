package com.jiangtao.design.pattern.app;

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Class: DesignPatternApp <br>
 * Description:  application<br>
 * Creator: kevin <br>
 * Date: 16/8/30 下午9:12 <br>
 * Update: 16/8/30 下午9:12 <br>
 */

public class DesignPatternApp extends Application {

  @Override public void onCreate() {
    super.onCreate();
    Fresco.initialize(this);
  }
}
