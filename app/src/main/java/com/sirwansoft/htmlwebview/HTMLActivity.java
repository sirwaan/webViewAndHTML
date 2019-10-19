package com.sirwansoft.htmlwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class HTMLActivity extends AppCompatActivity {
WebView webView;
String fileName ="file.html";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);

        webView=new WebView(this);
        webView=findViewById(R.id.webView_in_html_activity);

       webView.loadUrl("file:///android_asset/" + fileName);

    //    webView.loadUrl("https://yadamde.com/");

    }
}
