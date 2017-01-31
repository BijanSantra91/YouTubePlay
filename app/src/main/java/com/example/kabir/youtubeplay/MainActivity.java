package com.example.kabir.youtubeplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button b1;
    WebView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editText1);
        b1 = (Button) findViewById(R.id.button1);
        w1 = (WebView) findViewById(R.id.webView1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = et1.getText().toString();
                w1.getSettings().setJavaScriptEnabled(true);
                w1.loadUrl("http://m.youtube.com/result?q="+s1);
                w1.setWebViewClient(new WebViewClient());
            }
        });



      //  w1.setWebViewClient(new WebViewClient(){
        //      @Override
        //  public boolean shouldOverrideUrlLoading(WebView view, String url) {
        //      //FETCH VIDEO ID FROM URL
        //      //AND PASTE ON THE EDITTEXT
        //      url = url.substring(url.indexOf("https://m.youtube.com/watch?v="));
//
        //              return super.shouldOverrideUrlLoading(view, url);
//
        //          }
        //})//;

    }
}
