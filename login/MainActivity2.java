package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t1;
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         t1 = findViewById(R.id.t1);
         t2 = findViewById(R.id.t2);
         t1.setText(getIntent().getStringExtra("keyname"));
        t2.setText(getIntent().getStringExtra("keypassword"));

    }
}