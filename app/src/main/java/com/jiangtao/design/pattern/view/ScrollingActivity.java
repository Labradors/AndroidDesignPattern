package com.jiangtao.design.pattern.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.jiangtao.design.pattern.R;
import com.jiangtao.design.pattern.builder.book.Builder;
import com.jiangtao.design.pattern.builder.book.Director;
import com.jiangtao.design.pattern.builder.book.MacBookBuilder;
import java.util.ArrayList;

/**
 * Class: ScrollingActivity <br>
 * Description: 主页 <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午4:37 <br>
 * Update: 16/8/28 下午4:37 <br>
 */
public class ScrollingActivity extends AppCompatActivity implements
    NavigationAdapter.OnItemClickListener {

    public static final String TAG = ScrollingActivity.class.getSimpleName();
    private RecyclerView mNaviPage;
    private NavigationAdapter mNavigationAdapter;
    private ArrayList<String> mItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        mNaviPage = (RecyclerView) findViewById(R.id.view_navigation_page);
        setUpRecyclerView();
    }

    public void setUpRecyclerView(){
        buildItems();
        mNavigationAdapter = new NavigationAdapter(this,mItems,this);
        mNaviPage.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mNaviPage.setAdapter(mNavigationAdapter);
    }

    public void buildItems(){
        mItems = new ArrayList<>();
        mItems.add("MVP模式");
    }

  /**
   * builder设计模式
   */
  public void buildDesign(){
        Builder builder = new MacBookBuilder();
        Director pcDirector = new Director(builder);
        pcDirector.construct("英特尔主板","牛逼显示器");
        Log.d(TAG, "onCreate: "+builder.create().toString());
    }

    @Override public void onClick(int position) {
        switch (position){
            case 0:
                Intent intent = new Intent(ScrollingActivity.this,MvpActivity.class);
                startActivity(intent);
                break;
        }
    }
}
