package com.zxinglibrary.util;

import android.widget.Toast;

public class ByAlert {
    public static void alert(String info) {
        if (info != null) {
            if (info.equals("拒绝请求，验证签名失败。") || info.equals("")) {
                Toast.makeText(CapAwen.getContext(), "登录账号发生异常",
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(CapAwen.getContext(), info, Toast.LENGTH_LONG).show();
            }
        }
    }
}
