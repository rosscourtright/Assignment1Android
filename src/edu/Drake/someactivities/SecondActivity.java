package edu.Drake.someactivities;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity {
	
private static final String TAG = "SecondActivity";
	
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		//on click button code
        		Log.v(TAG, "button on view 2 pressed");
        		Intent intent = new Intent(v.getContext(), ThirdActivity.class);
        		startActivity(intent);
        	}
        });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second, menu);
		return true;
	}

}
