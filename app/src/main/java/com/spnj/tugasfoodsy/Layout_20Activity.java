package com.spnj.tugasfoodsy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Layout_20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_20);
    }
    public void processOrder(View view){
        Intent intent = new Intent();

        intent.setClass(Layout_20Activity.this, Layout_21Activity.class);

        startActivity(intent);
    }
}
