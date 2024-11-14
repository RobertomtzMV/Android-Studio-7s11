package com.example.parametros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnsiguiente, btnPasar;
    EditText txtA1Nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsiguiente = findViewById(R.id.btnA1Siguiente);
        btnPasar = findViewById(R.id.btnA1Pasar);
        txtA1Nombre = findViewById(R.id.txtNombre);

        btnPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PasoParametro(v);
            }
        });
    }
    public void sigPantalla(View v){
        Intent intent = new Intent(this, pantalla2.class);
        startActivity(intent);
    }

    public void PasoParametro(View v){
        Intent intent = new Intent(this, pantalla3.class);
        intent.putExtra("nombre", txtA1Nombre.getText().toString());
        startActivity(intent);
    }
}