package com.example.simpleparadox.listycity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MAINACTIVITY2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        TextView tv = findViewById(R.id.mainbox);
        tv.setText(intent.getStringExtra("value"));
        Button b = findViewById(R.id.Back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(MAINACTIVITY2.this, MainActivity.class);
                MAINACTIVITY2.this.startActivity(send);
            }
        });
    }

}