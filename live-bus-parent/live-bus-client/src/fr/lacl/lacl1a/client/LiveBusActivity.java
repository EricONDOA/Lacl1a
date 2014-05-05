package fr.lacl.lacl1a.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


/**
 * LiveBusActivity test that html5 work with android app, we use the webview api
 * 
 *
 */
public class LiveBusActivity extends Activity {
	private Button button;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		final Context context = this;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button button = (Button) findViewById(R.id.buttonLacl);
		button.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				Intent intent = new Intent(context, WebViewActivity.class);
				startActivity(intent);
			}

		});
	}
}