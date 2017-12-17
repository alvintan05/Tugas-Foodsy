package sahabatpnj.layout_foodies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout2 extends AppCompatActivity {
    Button panah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        panah = findViewById(R.id. imageView2);

        panah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(layout2.this, foodies.class);
                startActivity(z);
            }
        });
    }
}
