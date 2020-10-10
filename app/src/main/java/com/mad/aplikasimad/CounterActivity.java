package com.mad.aplikasimad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    ImageButton tombolplus, tombolminus;
    TextView countertv;
    int nilai = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        tombolplus = findViewById(R.id.tombolplus);
        tombolminus = findViewById(R.id.tombolminus);
        countertv = findViewById(R.id.angkaTV);

        tombolplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai += 1;
                olahdata();

            }
        });

        tombolminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai -= 1;
                olahdata();
            }

        });


    }

    private void olahdata() {
        countertv.setText(String.valueOf(nilai));
    }

}


