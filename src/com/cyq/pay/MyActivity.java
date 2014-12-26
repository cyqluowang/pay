package com.cyq.pay;

import com.github.lorcan.pwdkeyboard.R;

import android.app.Activity;
import android.app.Dialog;
import android.inputmethodservice.KeyboardView;
import android.os.Bundle;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        
        
        MyDialog dialog = new MyDialog(this,R.style.tttttt);
        dialog.setHH("jjjjjjjjj");
        dialog.show();
    }


}
