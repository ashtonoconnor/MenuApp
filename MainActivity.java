package com.example.ashtonocquickapplauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button quadraticBtn = (Button) findViewById(R.id.quadraticBtn);
        quadraticBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.quadraticashtonoc");
                if(launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });




        Button creativeBtn = (Button) findViewById(R.id.creativeBtn);
        creativeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.listapp");
                if(launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });





        Button peachBtn = (Button) findViewById(R.id.peachBtn);
        peachBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.originalapplist");
                if(launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });




        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.aofirstappaddition");
                if(launchIntent != null) {
                    startActivity(launchIntent);
                }
            }
        });

        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent launchIntent =  getPackageManager().getLaunchIntentForPackage("com.example.ashtonoconnorslopecalc");
                if(launchIntent != null) {
                    startActivity(launchIntent);
                }
                //Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                //startIntent.putExtra("org.mentorschools.quicklauncher.SOMETHING", "HELLO WORLD, this is Ashton!");
               // startActivity(startIntent);
            }
        });

        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.westada.org/chs";
                Uri webaddress = Uri.parse(google);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);
                }


            }
        });
















    }




}
