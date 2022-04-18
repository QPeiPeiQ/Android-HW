package com.example.android.recyclerview;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Recipes extends AppCompatActivity {
    private int state;
    private TextView mingredients;
    private TextView mprocedure;
    private ImageView mimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);
        mingredients = findViewById(R.id.ingredients_word);
        mprocedure = findViewById(R.id.procedure_word);
        mimage = findViewById(R.id.imageView1);

        Intent intent = getIntent();
        int message = intent.getIntExtra("num", 0);

        state = message + 1;
        if(state == 1) {
            mingredients.setText("cooking 1");
            mprocedure.setText("cooking 1");
            mimage.setImageDrawable(getResources().getDrawable(R.drawable.cooking1));
        }else if(state == 2) {
            mingredients.setText("cooking 2");
            mprocedure.setText("cooking 2");
            mimage.setImageDrawable(getResources().getDrawable(R.drawable.cooking2));
        }else if(state == 3) {
            mingredients.setText("cooking 3");
            mprocedure.setText("cooking 3");
            mimage.setImageDrawable(getResources().getDrawable(R.drawable.cooking3));
        }else if(state == 4) {
            mingredients.setText("cooking 4");
            mprocedure.setText("cooking 4");
            mimage.setImageDrawable(getResources().getDrawable(R.drawable.cooking4));
        }else if(state == 5) {
            mingredients.setText("cooking 5");
            mprocedure.setText("cooking 5");
            mimage.setImageDrawable(getResources().getDrawable(R.drawable.cooking5));
        }
    }




}