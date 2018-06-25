package com.zxinglibrary.util;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;

public class CapAwen {
    private CapAwen() {
    }

    @ColorRes
    private static int toolbarBackGround;
    private static Context mContext;
    /**
     * 保存图片到本地的地址
     */
    private static String path;

    public static void init(Context context) {
        init(context, android.R.color.holo_red_light);
    }

    public static void init(Context context, @ColorRes int toolbarBackGroundId) {
        init(context, toolbarBackGroundId, null);
    }

    /**
     *
     * @param context
     * @param toolbarBackGroundId
     */
    public static void init(Context context, @ColorRes int toolbarBackGroundId, String saveImageLocalPath) {
        if(mContext != null){//说明已经初始化过了,不用重复初始化
            return;
        }
        toolbarBackGround = toolbarBackGroundId;
        mContext = context.getApplicationContext();
        path = saveImageLocalPath;
    }

    @ColorInt
    public static int getToolbarBackGround() {
        return mContext.getResources().getColor(toolbarBackGround);
    }

    public static Context getContext() {
        return mContext;
    }

    public static String getSaveImageLocalPath() {
        return path;
    }

    public static void setToolbarBackGround(@ColorRes int toolbarBackGroundId) {
        toolbarBackGround = toolbarBackGroundId;
    }

    public static void setSaveImageLocalPath(String saveImageLocalPath){
        path = saveImageLocalPath;
    }

    public static void checkInit() {
        if (mContext == null) {
            throw new NullPointerException("photoLibrary was not initialized,please init in your Application");
        }
    }

    public static void destroy(){
        mContext = null;
        path = null;
    }

}
