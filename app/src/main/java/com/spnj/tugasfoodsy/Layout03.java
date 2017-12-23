package com.spnj.tugasfoodsy;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class Layout03 extends AppCompatActivity {

    TextView klik;
    ImageView pan;
    Button fb, twit, login;
    EditText firemail, firpass;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout03);

        klik = (TextView) findViewById(R.id.klik);
        pan = (ImageView) findViewById(R.id.panahh);

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
                Intent c = new Intent(Layout03.this, foodies.class);
                startActivity(c);
            }
        });

        fb = (Button) findViewById(R.id.fb);
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
                Intent twit = new Intent(Layout03.this, twitter.class);
                startActivity(twit);
            }
        });

        setInit();
    }

    private void setInit() {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mFirebaseAuth = FirebaseAuth.getInstance();

        firemail = (EditText) findViewById(R.id.button4);
        firpass = (EditText) findViewById(R.id.pwww);

        login = (Button) findViewById(R.id.inn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLogin();
            }
        });
    }

    private void onLogin() {
        String txtEmail = firemail.getText().toString().trim();
        String txtPass = firpass.getText().toString().trim();
        if (txtEmail.equals("") || txtPass.equals("")) {
            Toast.makeText(this, "Data belum diisi", Toast.LENGTH_SHORT).show();
        } else {
            loginfunction(txtEmail, txtPass);
        }
    }

    private void loginfunction(String txtEmail, String txtpass) {
        mFirebaseAuth.signInWithEmailAndPassword(txtEmail, txtpass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Intent intent = new Intent(Layout03.this, WelcomeActivity.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(getBaseContext(), "Email tidak valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
