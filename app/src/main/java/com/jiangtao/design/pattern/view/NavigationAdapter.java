package com.jiangtao.design.pattern.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jiangtao.design.pattern.R;
import java.util.ArrayList;

/**
 * Class: NavigationAdapter <br>
 * Description:  主页中的导航类<br>
 * Creator: kevin <br>
 * Date: 16/8/30 下午7:59 <br>
 * Update: 16/8/30 下午7:59 <br>
 */

public class NavigationAdapter extends RecyclerView.Adapter<NavigationViewHolder> {

  private Context mContext;
  private ArrayList<String> mTitleItems;
  private LayoutInflater mInflater;
  private OnItemClickListener mOnClickListener;

  public NavigationAdapter(Context context, ArrayList<String> items,OnItemClickListener onClickListener) {
    this.mContext = context;
    this.mTitleItems = items;
    mInflater = LayoutInflater.from(context);
    mOnClickListener = onClickListener;
  }

  @Override public NavigationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return new NavigationViewHolder(mInflater.inflate(R.layout.list_item_navigation, parent,false));
  }

  @Override public void onBindViewHolder(NavigationViewHolder holder, final int position) {
    holder.mTitleText.setText(mTitleItems.get(position));
    holder.mTitleText.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View varView) {
        mOnClickListener.onClick(position);
      }
    });
  }

  @Override public int getItemCount() {
    return mTitleItems.size();
  }

  public interface OnItemClickListener{
    void onClick(int position);
  }
}
