package com.makewishonline.makemoney;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        LinearLayout messenger = findViewById(R.id.messenger);
        LinearLayout whatsapp = findViewById(R.id.whatsapp);
        LinearLayout gmail = findViewById(R.id.gmail);

        messenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.me/uniquebyandroid"));
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.facebook.orca");
                if (launchIntent != null) {
                    intent.setPackage("com.facebook.orca");//null pointer check in case package name was not found
                    startActivity(intent);
                }
                else
                    Toast.makeText(ContactUs.this,"Please Install Facebook Messenger App From PlayStore",Toast.LENGTH_LONG).show();

            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("smsto:" + "+8801780948192");
                Intent i = new Intent(Intent.ACTION_SENDTO,uri);
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                if (launchIntent != null) {
                    i.setPackage("com.whatsapp");//null pointer check in case package name was not found
                    startActivity(i);
                }
                else
                    Toast.makeText(ContactUs.this,"Please Install WhatsApp From PlayStore",Toast.LENGTH_LONG).show();

            }
        });
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"uniquebyofficial@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "MakeWishOnline Support");
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.gm");
                if (launchIntent != null) {
                    intent.setPackage("com.google.android.gm");//null pointer check in case package name was not found
                    startActivity(intent);
                }
                else
                    Toast.makeText(ContactUs.this,"Please Install Gmail App From PlayStore",Toast.LENGTH_LONG).show();

            }
        });
    }
}
