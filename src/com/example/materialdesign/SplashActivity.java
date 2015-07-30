package com.example.materialdesign;


import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class SplashActivity extends Activity{

	AsyncTask<Void, Void, Void> mRegisterTask;
	SharedPreferences prefs_login,prefs_remember;
	int c_id;
	
	String remember,bookmark_count;
	String customer_name, customer_email;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splash_screen);

		/*boolean tabletSize = getResources().getBoolean(R.bool.isTablet);
		if (tabletSize) {
		    Toast.makeText(getApplicationContext(), "tablet", Toast.LENGTH_LONG).show(); 
		} else { 
			Toast.makeText(getApplicationContext(), "device", Toast.LENGTH_LONG).show(); 
		} */




		Timer t = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() { 

			/*	prefs_login=(SharedPreferences)getSharedPreferences("login_prefs", 0);
				c_id=prefs_login.getInt("c_id", -1);
				
				
				bookmark_count= prefs_login.getString("bookmark_country_count","");

				prefs_remember=(SharedPreferences)getSharedPreferences("prefs_remember", 0);
				Log.e("login remembersplash",""+prefs_remember.getString("loginName","null"));

				remember = prefs_remember.getString("loginName"," ");
*/
				Intent i;
				/*Intent i;
				if (c_id==-1) 

					i = new Intent(SplashActivity.this,LoginActivity.class);
				else*/
					/*if(!bookmark_count.equalsIgnoreCase(""))
					{*/
						i = new Intent(SplashActivity.this,MainActivity.class);
					/*}
					else
					{
						System.out.println("SelectCountryAllMain");
						i = new Intent(SplashActivity.this,SelectCountryAllMain.class);
					}

*/				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
				finish();
			}
		};
		t.schedule(task, 1000);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		View decorView = getWindow().getDecorView();

		int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
		decorView.setSystemUiVisibility(uiOptions);
	}
}
