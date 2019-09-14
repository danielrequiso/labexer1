package com.requiso.ustplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void displayMsg1(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.usthospital.com.ph/"));
        startActivity(i);
    }

    public void displayMsg2(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Field"));
        startActivity(i);
    }

    public void displayMsg3(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Arch_of_the_Centuries"));
        startActivity(i);
    }


    public void displayMsg4(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Main_Building"));
        startActivity(i);
    }


}
