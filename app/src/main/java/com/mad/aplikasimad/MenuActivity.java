package com.mad.aplikasimad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button counteractivity =findViewById(R.id.button1);
        Button tentangsaya = findViewById(R.id.button2);
        Button galeri = findViewById(R.id.button3);

        counteractivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindahhalaman1();

            }
        });

        tentangsaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindahhalaman2();

            }
        });

        galeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindahhalaman3();

            }
        });

    }
    private void pindahhalaman1() {


        Intent intent1 = new Intent(this, CounterActivity.class);
        startActivity(intent1);
    }

    private void pindahhalaman2() {


        Intent intent2 = new Intent(this, AboutmeActivity.class);
        startActivity(intent2);
    }
    private void pindahhalaman3() {


        Intent intent3 = new Intent(this, GalleryActivity.class);
        startActivity(intent3);
    }
}