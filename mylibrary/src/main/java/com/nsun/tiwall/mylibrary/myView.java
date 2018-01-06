package com.nsun.tiwall.mylibrary;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telecom.Connection;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 110 on 31/12/2017.
 */

public class myView {


    private final Context context;

    public myView(Context context){
        this.context = context;
    }



    public String test(String value){

        String a=value +"****";
        Log.i("value",a);
        return  a;
    }


}
