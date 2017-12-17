package com.spnj.tugasfoodsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Layout03 extends AppCompatActivity {

    TextView klik;
    ImageView pan;
    Button fb, twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout03);

        klik = (TextView) findViewById(R.id.klik);
        pan = (ImageView)findViewById(R.id.panahh);

        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Layout03.this, layout04.class);
                startActivity(b);
            }
        });

        pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Layout03.this, foodies.class );
                startActivity(c);
            }
        });

        fb = (Button)findViewById(R.id.fb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(Layout03.this, fb.class);
                startActivity(fb);
            }
        });

        twit = (Button) findViewById(R.id.twitt);
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twit = new Intent (Layout03.this, twitter.class);
                startActivity(twit);
            }
        });

    }
}
