package com.example.ecorecicla2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_noticias extends AppCompatActivity {

    ImageButton img_perfil,img_reciclar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);
        img_perfil = (ImageButton) findViewById(R.id.imbtn_perfil_perfil);
        img_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_noticias.this,Activity_perfil.class);
                startActivity(intent);
                finish();
            }
        });
        img_reciclar = (ImageButton) findViewById(R.id.img_reciclar_noticias);
        img_reciclar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_noticias.this,Activity_reciclaje.class);
                startActivity(intent);
                finish();
            }
        });
    }
}