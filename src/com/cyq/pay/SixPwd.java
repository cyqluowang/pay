package com.cyq.pay;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.github.lorcan.pwdkeyboard.R;

public class SixPwd extends LinearLayout implements TextWatcher {
	private EditText pwd;
	private View view;
	public static final int PWD_LEN = 6;
	private ImageView[] img = new ImageView[PWD_LEN];

	public SixPwd(Context context, AttributeSet attrs) {
		super(context, attrs);
		view = LayoutInflater.from(context).inflate(
				R.layout.pay_six_pwd, this);
		pwd = (EditText) view.findViewById(R.id.pwd_input);
		this.img[0] = (ImageView) view.findViewById(R.id.pwd_iv_1);
		this.img[1] = (ImageView) view.findViewById(R.id.pwd_iv_2);
		this.img[2] = (ImageView) view.findViewById(R.id.pwd_iv_3);
		this.img[3] = (ImageView) view.findViewById(R.id.pwd_iv_4);
		this.img[4] = (ImageView) view.findViewById(R.id.pwd_iv_5);
		this.img[5] = (ImageView) view.findViewById(R.id.pwd_iv_6);
		pwd.addTextChangedListener(this);
		changePoint();
	}

	@Override
	public void afterTextChanged(Editable s) {
		changePoint();
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,int after) {

	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {

	}
	
	
	public void changePoint() {
		int length = this.pwd.getText().length();
		
		for (int i = 0; i < PWD_LEN; i++) {
			if(i < length){
				this.img[i].setVisibility(View.VISIBLE);
			}else{
				this.img[i].setVisibility(View.GONE);
			}
		}
		

	}
	
	public abstract interface PwdLength {
		public abstract void changed(int paramInt);
	}
	
	  public void resetPwd(){
	    this.pwd.setText("");
	  }
	  
	  
	public String getPwd() {
		return this.pwd.getText().toString();
	}

}
