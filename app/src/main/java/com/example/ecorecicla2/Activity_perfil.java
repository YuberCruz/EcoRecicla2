package com.example.ecorecicla2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_perfil extends AppCompatActivity {

    ImageButton img_reciclaje_perfil,img_news_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        img_news_perfil = (ImageButton) findViewById(R.id.imbtn_news_perfil);
        img_news_perfil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_perfil.this, Activity_noticias.class);
                startActivity(intent);
                finish();
            }
        });
        img_reciclaje_perfil = (ImageButton) findViewById(R.id.img_reciclaje_perfil);
        img_reciclaje_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_perfil.this, Activity_reciclaje.class);
                startActivity(intent);
                finish();
            }
        });
    }
}