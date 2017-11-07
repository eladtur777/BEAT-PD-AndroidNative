package com.example.eltur.parkinsonbp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class information extends AppCompatActivity {

    WebView myWebView;
    Button backToMenuButton;
private ArrayList<String> LinksList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        backToMenuButton = (Button) findViewById(R.id.button2);
        myWebView = (WebView) findViewById(R.id.webview1);
        ServerService conn = new ServerService();
        LinksList = conn.GetAllLinks();
        myWebView.loadUrl(LinksList.get(LinksList.size()-1));

        backToMenuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(information.this, firstpage.class);
                startActivity(i);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    finishAffinity();
                }


            }
        });

    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(information.this, firstpage.class));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            finishAffinity();
        }
    }

}


