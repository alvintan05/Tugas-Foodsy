package sahabatpnj.layout_foodies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Foodies extends AppCompatActivity {

    Button tombolsignin,button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodies);

        tombolsignin = findViewById(R.id.tombolsignin);
        button = findViewById(R.id.button);

        tombolsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Foodies.this, Layout03.class);
                startActivity(i);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Foodies.this, layout2.class);
                startActivity(a);

            }
        });
    }

}
