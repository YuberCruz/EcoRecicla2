package com.example.ecorecicla2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_reciclaje extends AppCompatActivity {

    Spinner spinner;
    ImageButton img_perfil_reciclaje,img_news_reciclaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclaje);

        spinner = (Spinner) findViewById(R.id.spinner);
        String [] opciones ={"Agua","Papel","Carton","Metal","Plastico"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,R.layout.spinner_item_nuevo,opciones);
        spinner.setAdapter(adapter);

        img_news_reciclaje  = (ImageButton) findViewById(R.id.imbtn_news_reciclaje);
        img_news_reciclaje.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_reciclaje.this, Activity_noticias.class);
                startActivity(intent);
                finish();
            }
        });
        img_perfil_reciclaje = (ImageButton) findViewById(R.id.imbtn_perfil_reciclaje);
        img_perfil_reciclaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_reciclaje.this,Activity_perfil.class);
                startActivity(intent);
                finish();
            }
        });
    }
}