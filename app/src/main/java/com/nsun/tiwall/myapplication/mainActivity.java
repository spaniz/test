package com.nsun.tiwall.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nsun.tiwall.mylibrary.MyView;

/**
 * Created by 110 on 31/12/2017.
 */


public class mainActivity extends Activity {
    public TextView text;
	
	//
    public EditText input;
    public String result,inputValue;
    public  MyView mview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        text = (TextView) findViewById(R.id.textView);
        input =(EditText) findViewById(R.id.editText);


        mview = new MyView(this);


        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputValue= input.getText().toString();
                result=mview.test(inputValue);
                Log.i("log",result );

            }
        });

    }



}