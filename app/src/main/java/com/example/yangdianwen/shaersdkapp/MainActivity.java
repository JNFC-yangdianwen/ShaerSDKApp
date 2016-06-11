package com.example.yangdianwen.shaersdkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.yangdianwen.shaersdkapp.onekeyshare.OnekeyShare;
import cn.sharesdk.framework.ShareSDK;
public class MainActivity extends AppCompatActivity {
    private Button mFrd;
    private Button mWeixin;
    private Button mQq;
    private Button mWeibo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShareSDK.initSDK(this);
        mFrd = (Button) findViewById(R.id.button);
        mWeixin = (Button) findViewById(R.id.button2);
        mQq = (Button) findViewById(R.id.button3);
        mWeibo = (Button) findViewById(R.id.button4);
        mFrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(v.getId()){
                    case R.id.button:

                        OnekeyShare onekeyShare=new OnekeyShare();

                        onekeyShare.setTitle("一键分享");
                                onekeyShare.setText("这是一键分享功能");
//                        onekeyShare.setImageUrl("http//:www.baidu.com");
                                        onekeyShare.show(MainActivity.this);
                        break;
                }
            }
        });

    }
}
