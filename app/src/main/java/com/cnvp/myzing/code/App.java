package com.cnvp.myzing.code;

import android.app.Application;

import com.zxinglibrary.util.CapAwen;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CapAwen.init(this);
    }
}
