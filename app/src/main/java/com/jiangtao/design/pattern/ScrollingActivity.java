package com.jiangtao.design.pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.jiangtao.design.pattern.builder.book.Builder;
import com.jiangtao.design.pattern.builder.book.Director;
import com.jiangtao.design.pattern.builder.book.MacBookBuilder;

/**
 * Class: ScrollingActivity <br>
 * Description: 主页 <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午4:37 <br>
 * Update: 16/8/28 下午4:37 <br>
 */
public class ScrollingActivity extends AppCompatActivity {

    public static final String TAG = ScrollingActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Builder builder = new MacBookBuilder();
        Director pcDirector = new Director(builder);
        pcDirector.construct("英特尔主板","牛逼显示器");
        Log.d(TAG, "onCreate: "+builder.create().toString());
    }
}
