package com.example.ecorecicla2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton imbtn_news,imbtn_perfil,imbtn_reciclar;
    private Button btn_estadisticas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imbtn_perfil = (ImageButton) findViewById(R.id.imbtn_perfil_reciclaje);
        imbtn_perfil.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_perfil.class);
                startActivity(intent);
            }
        });
        imbtn_news = (ImageButton) findViewById(R.id.imbtn_news_reciclaje);
        imbtn_news.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_noticias.class);
                startActivity(intent);
            }
        });
        imbtn_reciclar = (ImageButton) findViewById(R.id.img_reciclage_reciclaje);
        imbtn_reciclar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_reciclaje.class);
                startActivity(intent);
            }
        });

    }
}