package com.example.khaddonirapottaovoktaodhikar.ViewActiviy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.khaddonirapottaovoktaodhikar.R;

public class ViewActivity extends AppCompatActivity {

    String rcvtext;
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        view = findViewById(R.id.view);
        Intent viewIntent = getIntent();
        rcvtext = viewIntent.getStringExtra("brief");
        view.setText(rcvtext);
    }
}
