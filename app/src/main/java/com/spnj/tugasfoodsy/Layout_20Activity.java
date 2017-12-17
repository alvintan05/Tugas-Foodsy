package com.spnj.tugasfoodsy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.Toolbar;

public class Layout_20Activity extends AppCompatActivity {
    Toolbar tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_20);
        //agar toolbar ada tombol back
        tb=(android.support.v7.widget.Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }
    public void pay(View view){
        Intent intent = new Intent();

        intent.setClass(Layout_20Activity.this, Layout_21Activity.class);

        startActivity(intent);
    }
}
