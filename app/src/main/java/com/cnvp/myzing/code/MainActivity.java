package com.cnvp.myzing.code;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zxinglibrary.util.QRCodeUtil;

public class MainActivity extends AppCompatActivity {
    private String balanceUrl = "http://hmds.wclub8.cn/api/App/id/1024";
    private int colror1 = 0xff87CEEB;
    private int corlor2 = 0xffffffff;
    private Bitmap bitmap;
    private ImageView iv_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_code=findViewById(R.id.iv_code);
        bitmap = QRCodeUtil.createQRCodeBitmap(balanceUrl, 500, colror1, corlor2);
        iv_code.setImageBitmap(bitmap);
    }
}
