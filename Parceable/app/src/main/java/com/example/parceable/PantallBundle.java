package com.example.parceable;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PantallBundle extends AppCompatActivity {
    TextView nombre, correo, numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantall_bundle);

        Datos datos = getIntent().getParcelableExtra("datosParce");
        nombre = findViewById(R.id.lblA2Nombre);
        correo = findViewById(R.id.lblA2Correo);
        numero = findViewById(R.id.lblA2Numero);

        nombre.setText(datos.getNombre());
        correo.setText(datos.getCorreo());
        numero.setText(datos.getNumero());
    }
}