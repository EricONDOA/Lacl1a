package fr.lacl.lacl1a.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


/**
 * LiveBusActivity test that html5 work with android app, we use the webview api
 * 
 *
 */
public class LiveBusActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
			String url = "http://www.lacl.fr";
			WebView view = (WebView) findViewById(R.id.webviewLacl);
			view.getSettings().setJavaScriptEnabled(true);
			view.loadUrl(url);
			view.setWebViewClient(new WebViewClient());
			

	}
}