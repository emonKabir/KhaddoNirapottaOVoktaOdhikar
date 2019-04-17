package com.example.khaddonirapottaovoktaodhikar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView nirapodKhaddo,voktaOdhikar;


    ViewFlipper v_flipper;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_layout);

        nirapodKhaddo = findViewById(R.id.khaddoButton);
        voktaOdhikar = findViewById(R.id.voktaButton);

        int images[] = {R.drawable.slide_1,R.drawable.slide_2,R.drawable.slide_3};

        v_flipper = findViewById(R.id.v_flipper);

        nirapodKhaddo.setOnClickListener(this);
        voktaOdhikar.setOnClickListener(this);
       /* for (int i=0;i<images.length;i++){
            flipperImages(images[i]);
        }*/

        for (int image :images){
            flipperImages(image);
        }



    }

    public  void flipperImages (int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);

        /*v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this,android.R.anim.slide_out_right);*/
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
        v_flipper.setAutoStart(true);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.khaddoButton:
                startActivity(new Intent(MainActivity.this,Khaddo_nirapotta.class));
                break;
            case R.id.voktaButton:
                startActivity(new Intent(MainActivity.this,vokta_odhikar.class));
                break;
        }
    }
}

