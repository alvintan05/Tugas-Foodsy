package com.spnj.tugasfoodsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class layout04 extends AppCompatActivity {

    ImageView back;
    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout04);

        back =(ImageView) findViewById(R.id.back);
        pindah = (Button)findViewById(R.id.yaAllah);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(layout04.this, Layout03.class);
                startActivity(x);
            }
        });

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(layout04.this, Layout_10.class);
                startActivity(y);
            }
        });
    }
}
