package fr.lacl.lacl1a.client;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends Activity {
	
	private WebView webView;
	 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
 
		webView = (WebView) findViewById(R.id.webViewLacl);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl("http://www.lacl.fr");
 
	}
 
}
