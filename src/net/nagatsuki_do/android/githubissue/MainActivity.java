package net.nagatsuki_do.android.githubissue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		
		Intent intent = new Intent(MainActivity.this, PostActivity.class);
		startActivity(intent);
		finish();
	}

}
