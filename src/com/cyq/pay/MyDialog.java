package com.cyq.pay;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.lorcan.pwdkeyboard.R;

public class MyDialog extends Dialog {
	private SixPwd pwd;
	private Button pay;
	private String  hh;
	private TextView  tip;

    Context context;
    public MyDialog(Context context) {
        super(context);
        this.context = context;
    }
    public MyDialog(Context context, int theme){
        super(context, theme);
        this.context = context;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.pay_dialog);
        pwd = (SixPwd) findViewById(R.id.pwdInputBox);
        pay = (Button) findViewById(R.id.btn_pay);
        tip = (TextView) findViewById(R.id.pay_balance_amount_tip);
        
        String sAgeFormat1= context.getResources().getString(R.string.ebpay_wallet_banlance_tip);     
        
        String sFinal1 = String.format(sAgeFormat1, 11,22,33,44);   
        tip.setText(sFinal1);
        pay.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(context, pwd.getPwd()+hh,
					     Toast.LENGTH_SHORT).show();
				
			}
		});
    }
    
    
    public void setHH(String hh){
    	this.hh = hh;
    }

}
