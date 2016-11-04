package com.example.p.sander_dewijs_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setImage(View view) {
        // check which checkbox is checked
        switch(view.getId()) {
            // if checkbox id is checked, go into case
            case R.id.Arms:
                ImageView arms = (ImageView) findViewById(R.id.imgarms);
                // set imageview to visible if checkbox is checked
                if (((CheckBox) view).isChecked())
                    arms.setVisibility(View.VISIBLE);
                else
                    arms.setVisibility(View.INVISIBLE);
            break;
            case R.id.Ears:
                ImageView ears = (ImageView) findViewById(R.id.imgears);
                if (((CheckBox) view).isChecked())
                    ears.setVisibility(View.VISIBLE);
                else
                    ears.setVisibility(View.INVISIBLE);
            break;
            case R.id.Eyebrows:
                ImageView eyebrows = (ImageView) findViewById(R.id.imgeyebrows);
                if (((CheckBox) view).isChecked())
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
            break;
            case R.id.Eyes:
                ImageView eyes = (ImageView) findViewById(R.id.imgeyes);
                if (((CheckBox) view).isChecked())
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
            break;
            case R.id.Glasses:
                ImageView glasses = (ImageView) findViewById(R.id.imgglasses);
                if (((CheckBox) view).isChecked())
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
            break;
            case R.id.Hat:
                ImageView hat = (ImageView) findViewById(R.id.imghat);
                if (((CheckBox) view).isChecked())
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
            break;
            case R.id.Mouth:
                ImageView mouth = (ImageView) findViewById(R.id.imgmouth);
                if (((CheckBox) view).isChecked())
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);
            break;
            case R.id.Mustache:
                ImageView mustache = (ImageView) findViewById(R.id.imgmustache);
                if (((CheckBox) view).isChecked())
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
            break;
            case R.id.Nose:
                ImageView nose = (ImageView) findViewById(R.id.imgnose);
                if (((CheckBox) view).isChecked())
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
            break;
            case R.id.Shoes:
                ImageView shoes = (ImageView) findViewById(R.id.imgshoes);
                if (((CheckBox) view).isChecked())
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
            break;
        }
    }
}
