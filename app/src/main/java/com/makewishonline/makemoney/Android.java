package com.makewishonline.makemoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;

public class Android extends AppCompatActivity {

    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        adView = new AdView(this, "418617318684282_418619015350779", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = findViewById(R.id.banner_container);
        //loadAdView();

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();


        LinearLayout android_app = findViewById(R.id.android_app);

        android_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity = new Intent(Android.this, Android_app.class);
                startActivity(nextActivity);
            }
        });




    }
    @Override
    public void onBackPressed() {
        finish();

    }

    protected void onDestroy() {
       if (adView != null) {
                adView.destroy();
            }
            super.onDestroy();

    }

}
