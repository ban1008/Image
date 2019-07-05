package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPressed(View view) {
        ImageView im=findViewById(R.id.iv);
        Switch sw=findViewById(R.id.sw);
        ImageButton ib= findViewById(R.id.ib);
        RadioButton rb1=findViewById(R.id.rb1);
        RadioButton rb2=findViewById(R.id.rb2);

        CheckBox cb=findViewById(R.id.cb);
        if(sw.isChecked())
        {
            im.setVisibility(View.VISIBLE);
        }
        else
        {
            im.setVisibility(View.INVISIBLE);
        }
        if(rb1.isChecked())
        {
            ib.setEnabled(false);
        }
        else
        {
            ib.setEnabled(true);
        }
        if(cb.isChecked())
        {
            ib.setVisibility(View.VISIBLE);
        }
        else
        {
            ib.setVisibility(View.INVISIBLE);
        }
    }

    public void onImagePressed(View view) {
        Toast.makeText(this, "Image Button Clicked", Toast.LENGTH_SHORT).show();
    }
}
