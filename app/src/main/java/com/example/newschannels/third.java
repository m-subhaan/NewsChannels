package com.example.newschannels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent=getIntent();
        int index1= intent.getExtras().getInt("firstindex");
        int index2= intent.getExtras().getInt("secondindex");
        WebView w1= (WebView) findViewById(R.id.web);


        WebSettings webSettings = w1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        if(index1==0)
        {
            if(index2==0){ w1.loadUrl("https://www.geo.tv/"); }
            if(index2==1){ w1.loadUrl("https://dunyanews.tv/"); }
            if(index2==2){ w1.loadUrl("https://www.express.com.pk/"); }
        }

        if(index1==1)
        {
            if(index2==0){ w1.loadUrl("https://punjabi.abplive.com/"); }
            if(index2==1){ w1.loadUrl("https://economictimes.indiatimes.com/topic/Shop-CJ-Network"); }
            if(index2==2){ w1.loadUrl("https://www.24newshd.tv/latest"); }
        }

        if(index1==2)
        {
            if(index2==0){ w1.loadUrl("https://www.msnbc.com/"); }
            if(index2==1){ w1.loadUrl("https://edition.cnn.com/"); }
        }
    }
}
