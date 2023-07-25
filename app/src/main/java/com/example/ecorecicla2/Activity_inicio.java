package com.example.ecorecicla2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_inicio extends AppCompatActivity {

    public Button btn_login,btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        btn_login = (Button) findViewById(R.id.btn_iniciar_sesion);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_inicio.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btn_register = (Button) findViewById(R.id.btn_registrar_inicio);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_inicio.this, Activity_registro.class);
                startActivity(intent);
            }
        });
    }
}