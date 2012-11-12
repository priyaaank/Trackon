package com.barefoot.trackon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends Activity
{
		@Override
		public void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.splash_screen);

				Handler handler = new Handler();
				handler.postDelayed(new Runnable() {
						@Override
						public void run() {
								finish();
								Intent intent = new Intent(SplashScreenActivity.this, HomeActivity.class);
								SplashScreenActivity.this.startActivity(intent);
						}

				}, 2000);

		}
}
