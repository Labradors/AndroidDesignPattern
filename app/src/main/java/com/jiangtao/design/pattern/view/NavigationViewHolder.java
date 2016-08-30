package com.jiangtao.design.pattern.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.jiangtao.design.pattern.R;

/**
 * Class: NavigationViewHolder <br>
 * Description: 主页中recyclerview的viewolder <br>
 * Creator: kevin <br>
 * Date: 16/8/30 下午8:01 <br>
 * Update: 16/8/30 下午8:01 <br>
 */

public class NavigationViewHolder extends RecyclerView.ViewHolder {

  public TextView mTitleText;

  public NavigationViewHolder(View itemView) {
    super(itemView);
    mTitleText = (TextView) itemView.findViewById(R.id.item_title);
  }
}
