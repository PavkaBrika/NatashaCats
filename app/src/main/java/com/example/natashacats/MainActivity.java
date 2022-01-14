package com.example.natashacats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView secondText = (TextView) findViewById(R.id.txt2);
        TextView thirdText = (TextView) findViewById(R.id.txt3);
        TextView forthText = (TextView) findViewById(R.id.txt4);
        ImageView cat = (ImageView) findViewById(R.id.imageView4);

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phrases[] = {"Они щас все\nЕве сломают!",
                        "Настя уже без\nмузыки танцует!!!",
                        "Данэль не справляется\nс Настей!!",
                        "Еве стало плохо",
                        "Они морду потеряли!!!" };

                Random random = new Random();
                secondText.setText(phrases[random.nextInt(4)]);
                thirdText.setText(phrases[random.nextInt(4)]);
                forthText.setText(phrases[random.nextInt(4)]);
            }
        });

    }


}