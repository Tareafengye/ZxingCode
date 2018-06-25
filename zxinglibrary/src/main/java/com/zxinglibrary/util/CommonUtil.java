package com.zxinglibrary.util;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import com.zxinglibrary.activity.CaptureActivity;

/**
 * @className: CommonUtil
 * @classDescription: 通用工具类
 */
public class CommonUtil {

    /**
     * @author miao
     * @createTime 2017年2月10日
     * @lastModify 2017年2月10日
     * @param
     * @return
     */
    public static boolean isCameraCanUse() {
            boolean canUse = true;
            Camera mCamera = null;
            try {
                mCamera = Camera.open();
            } catch (Exception e) {
                canUse = false;
            }
            if (canUse) {
                if (mCamera != null)
                    mCamera.release();
                mCamera = null;
            }
            return canUse;
    }
    /**
     * 扫码跳转
     *
     * @param activity
     */
    public static void getCapIntent(Activity activity) {
        //Android 6.0权限判断
        if (ContextCompat.checkSelfPermission(activity, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CAMERA}, 1);
        } else {
            //跳转至扫描页面
            startCaptureActivityForResult(activity);
        }
    }
    /**
     * 跳转至扫描页面
     */

    public static void startCaptureActivityForResult(Activity activity) {
        Intent intent = new Intent(activity, CaptureActivity.class);
        activity. startActivityForResult(intent, 1);
    }
}
