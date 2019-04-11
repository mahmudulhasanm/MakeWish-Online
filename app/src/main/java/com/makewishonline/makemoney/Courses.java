package com.makewishonline.makemoney;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;


public class Courses extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__corses);

        adView = new AdView(this, "418617318684282_418619015350779", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = findViewById(R.id.banner_container);
        //loadAdView();

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();


        LinearLayout contact = findViewById(R.id.contact);
        LinearLayout contact2 = findViewById(R.id.contact2);
        LinearLayout topbrowser = findViewById(R.id.topbrowser);
        LinearLayout vpn = findViewById(R.id.turbovpn);


        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity = new Intent(Courses.this,ContactUs.class);
                startActivity(nextActivity);
            }
        });
        contact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity = new Intent(Courses.this,ContactUs.class);
                startActivity(nextActivity);
            }
        });
        topbrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.uniqueby.topbrowser"));
                startActivity(intent);
            }
        });
        vpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.uniqueby.turbovpnfree"));
                startActivity(intent);
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
