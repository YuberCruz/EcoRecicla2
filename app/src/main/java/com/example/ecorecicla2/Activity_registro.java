package com.example.ecorecicla2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_registro extends AppCompatActivity {

    private Button btn_registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btn_registro = (Button) findViewById(R.id.btn_registro_registro);
        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity_registro.this,
                        "Registro satisfactorio",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}