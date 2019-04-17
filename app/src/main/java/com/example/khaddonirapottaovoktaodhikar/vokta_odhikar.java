package com.example.khaddonirapottaovoktaodhikar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.khaddonirapottaovoktaodhikar.ModelClass.SampleClass;
import com.example.khaddonirapottaovoktaodhikar.ViewActiviy.ViewActivity;

import java.util.ArrayList;
import java.util.List;

public class vokta_odhikar extends AppCompatActivity implements View.OnClickListener{


    Intent intent;
    ListView listView;
    List<String> stringList;
    List<SampleClass>sampleClassList;
    CardView odhikar,oporadh,protikar,dondo,ovijog,jogajog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vokta_odhikar);



        odhikar = findViewById(R.id.odhikar);
        oporadh = findViewById(R.id.oporadh);
        protikar = findViewById(R.id.protikar);
        dondo = findViewById(R.id.dondo);
        ovijog = findViewById(R.id.ovijog);
        jogajog = findViewById(R.id.jogajog);

        odhikar.setOnClickListener(this);
        oporadh.setOnClickListener(this);
        dondo.setOnClickListener(this);
        ovijog.setOnClickListener(this);
        jogajog.setOnClickListener(this);
        protikar.setOnClickListener(this);



       /* sampleClassList = new ArrayList<>();
        sampleClassList.add(new SampleClass(R.drawable.odhikar,getString(R.string.odhikar)));
        sampleClassList.add(new SampleClass(R.drawable.oporadh,getString(R.string.oporadh)));
        sampleClassList.add(new SampleClass(R.drawable.protikar,getString(R.string.protikar)));
        sampleClassList.add(new SampleClass(R.drawable.dondo,getString(R.string.dondo)));
        sampleClassList.add(new SampleClass(R.drawable.ovijog,getString(R.string.ovizog)));
        sampleClassList.add(new SampleClass(R.drawable.jogajog,getString(R.string.zogazog)));*/



//        listView = findViewById(R.id.listview);

        intent = new Intent(vokta_odhikar.this, ViewActivity.class);

      /* MyAdapter myAdapter = new MyAdapter(this,sampleClassList);
       listView.setAdapter(myAdapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               switch (position){
                   case 0:

                       intent.putExtra("brief",getString(R.string.odhikarText));
                       startActivity(intent);
                       break;
                   case 1:

                       intent.putExtra("brief",getString(R.string.oporadhText));
                       startActivity(intent);
                       break;
                   case 2:

                       intent.putExtra("brief",getString(R.string.dondoText));
                       startActivity(intent);
                       break;

                   case 3:

                       intent.putExtra("brief",getString(R.string.protikarText));
                       startActivity(intent);
                       break;
                   case 4:

                       intent.putExtra("brief",getString(R.string.ovizogText));
                       startActivity(intent);
                       break;
                   case 5:

                       intent.putExtra("brief",getString(R.string.zogazogText));
                       startActivity(intent);
                       break;
               }

               }


       });*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.odhikar:

                intent.putExtra("brief",getString(R.string.odhikarText));
                startActivity(intent);
                break;
            case R.id.oporadh:

                intent.putExtra("brief",getString(R.string.oporadhText));
                startActivity(intent);
                break;
            case R.id.dondo:

                intent.putExtra("brief",getString(R.string.dondoText));
                startActivity(intent);
                break;

            case R.id.protikar:

                intent.putExtra("brief",getString(R.string.protikarText));
                startActivity(intent);
                break;
            case R.id.ovijog:
                Intent intent2 = new Intent(vokta_odhikar.this,Ovijog.class);
                intent2.putExtra("brief",getString(R.string.ovizogText));
                startActivity(intent2);
                break;
            case R.id.jogajog:

                intent.putExtra("brief",getString(R.string.zogazogText));
                startActivity(intent);
                break;
        }
    }
}
