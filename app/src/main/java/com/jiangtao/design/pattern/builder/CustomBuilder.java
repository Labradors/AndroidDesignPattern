package com.jiangtao.design.pattern.builder;

/**
 * Class: CustomBuilder <br>
 * Description: 项目中使用的builder <br>
 * Creator: kevin <br>
 * Date: 16/8/28 下午6:08 <br>
 * Update: 16/8/28 下午6:08 <br>
 */

public class CustomBuilder {

  public int mItemType;
  public  boolean mDivider;
  public  boolean mEnable;
  public Object mObject;

  private CustomBuilder(){}

  public static class Builder{

    public int itemType;
    public boolean divider;
    public boolean enable;
    public Object object;

    public CustomBuilder build(){
    CustomBuilder builder = new CustomBuilder();
      builder.mDivider = divider;
      builder.mEnable = enable;
      builder.mItemType = itemType;
      builder.mObject = object;
      return builder;
    }

    public Builder divider(boolean divider){
      this.divider = divider;
      return this;
    }

    public Builder enable(boolean enable){
      this.enable = enable;
      return  this;
    }

    public Builder itemType(int itemType){
      this.itemType = itemType;
      return this;
    }

    public Builder object(Object obj){
      this.object = obj;
      return this;
    }
  }

  public CustomBuilder(int itemType,boolean divider,boolean mEnable,Object mObject){
    this.mObject = mObject;
    this.mItemType = itemType;
    this.mDivider = divider;
    this.mEnable = mEnable;
  }
}
