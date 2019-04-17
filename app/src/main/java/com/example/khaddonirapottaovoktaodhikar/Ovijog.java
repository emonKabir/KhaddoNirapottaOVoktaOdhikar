package com.example.khaddonirapottaovoktaodhikar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.khaddonirapottaovoktaodhikar.LikhitoOvijog.LikhitoOvijog;

public class Ovijog extends AppCompatActivity implements View.OnClickListener{


    TextView textView;
    Button likhitoOvijog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovijog);

        Intent intent = getIntent();
        String string = intent.getStringExtra("brief");

        textView = findViewById(R.id.textview);
        textView.setText(string);
        likhitoOvijog = findViewById(R.id.likhitoOvjog);
        likhitoOvijog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        startActivity(new Intent(Ovijog.this, LikhitoOvijog.class));

    }
}
