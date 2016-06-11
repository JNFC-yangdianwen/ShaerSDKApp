package com.example.yangdianwen.shaersdkapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SuibianActivity extends Activity implements View.OnClickListener {

    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suibian);

        textView = (TextView) findViewById(R.id.textView);
        findViewById(R.id.button5).setOnClickListener(this);
        textView2 = (TextView) findViewById(R.id.textView2);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button5:
                //TODO implement
                break;
        }
    }

    private EditText getEditText(){
        return (EditText) findViewById(R.id.editText);
    }
}
