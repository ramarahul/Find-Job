package com.example.findjob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    ImageView logo_inside;
    TextView title_inside,description_inside;

    String data1,data2;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        logo_inside = findViewById(R.id.logo_inside);
        title_inside = findViewById(R.id.title_inside);
        description_inside = findViewById(R.id.description_inside);

        getData();
        setData();
    }

    private void getData(){
        if(getIntent().hasExtra("image") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            image = getIntent().getIntExtra("image",1);

        }
        else{
            Toast.makeText(this,"No Data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        title_inside.setText(data1);
        description_inside.setText(data2);
        logo_inside.setImageResource(image);
    }
}