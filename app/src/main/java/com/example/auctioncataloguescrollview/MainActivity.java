package com.example.auctioncataloguescrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout gallery = findViewById(R.id.gallery);
        LayoutInflater inflater = LayoutInflater.from(this);

        TextView lotNoTextView = findViewById(R.id.lotTextView);
        lotNoTextView.setText("1");


        for (int i =0; i <6; i++){

            View view = inflater.inflate(R.layout.item, gallery, false);
            TextView textView = view.findViewById(R.id.text);
            textView.setText("Lot " + i);

            ImageView imageView = view.findViewById(R.id.imageView);
            imageView.setImageResource(R.mipmap.ic_launcher);

            gallery.addView(view);


        }
    }
}
