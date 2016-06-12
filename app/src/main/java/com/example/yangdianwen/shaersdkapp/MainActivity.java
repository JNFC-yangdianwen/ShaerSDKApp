package com.example.yangdianwen.shaersdkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yangdianwen.shaersdkapp.onekeyshare.OnekeyShare;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.tencent.weibo.TencentWeibo;
import cn.sharesdk.wechat.favorite.WechatFavorite;
import cn.sharesdk.wechat.friends.Wechat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mFrd;
    private Button mWeixin;
    private Button mQq;
    private Button mWeibo;
    private OnekeyShare mOnekeyShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShareSDK.initSDK(this);
        mOnekeyShare = new OnekeyShare();
        mFrd = (Button) findViewById(R.id.button);
        mWeixin = (Button) findViewById(R.id.button2);
        mQq = (Button) findViewById(R.id.button3);
        mWeibo = (Button) findViewById(R.id.button4);
        mFrd.setOnClickListener(this);
        mQq.setOnClickListener(this);
        mWeibo.setOnClickListener(this);
        mWeixin.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                mOnekeyShare.setPlatform(WechatFavorite.NAME);
                mOnekeyShare.show(MainActivity.this);
                break;
            case R.id.button2:
                mOnekeyShare.setPlatform(Wechat.NAME);
                mOnekeyShare.show(MainActivity.this);
                break;
            case R.id.button3:
                mOnekeyShare.setPlatform(QQ.NAME);
                mOnekeyShare.show(MainActivity.this);
                break;
            case R.id.button4:
                mOnekeyShare.setPlatform(TencentWeibo.NAME);
                mOnekeyShare.show(MainActivity.this);
                break;
        }

    }
}
