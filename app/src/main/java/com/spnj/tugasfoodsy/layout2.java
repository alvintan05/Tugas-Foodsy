package com.spnj.tugasfoodsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class layout2 extends AppCompatActivity {
    ImageView panah;
    Button fb, twit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        panah = (ImageView) findViewById(R.id.panahback);
        panah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(layout2.this, foodies.class);
                startActivity(z);
            }
        });

        fb = (Button)findViewById(R.id.button3);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(layout2.this, fb.class);
                startActivity(fb);
            }
        });

        twit = (Button) findViewById(R.id.button_twit);
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twit = new Intent (layout2.this, twitter.class);
                startActivity(twit);
            }
        });
    }
}
