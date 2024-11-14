package com.example.parceable;

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
    EditText nombre, correo, numero;
    Button pasar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.txtA1Nombre);
        correo = findViewById(R.id.txtA1Correo);
        numero = findViewById(R.id.txtA1Numero);
        pasar = findViewById(R.id.btnPasar);

        pasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               envioBundle(v);
            }
        });
    }
    public void envioBundle(View v){
        Datos datos = new Datos(nombre.getText().toString(), correo.getText().toString(), numero.getText().toString());
        Intent intent = new Intent(this, PantallBundle.class);
        intent.putExtra("datosParce", datos);
        startActivity(intent);
    }
}