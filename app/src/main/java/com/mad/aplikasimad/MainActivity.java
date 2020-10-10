package com.mad.aplikasimad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton tombolmulai = findViewById(R.id.Buttonpanah);

        tombolmulai.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pindahhalaman();

                    }
                });



    }


        private void pindahhalaman() {


            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        }

}