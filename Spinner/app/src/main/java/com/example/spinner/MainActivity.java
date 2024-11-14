package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner estado;
    List<String> Milista = new ArrayList<>(Arrays.asList("Edo Mex", "CDMX", "Puebla", "Morelos", "Veracruz", "Guerreo"));
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        estado = findViewById(R.id.spA1Estado);
        estado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String valor = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "Se selecciono: "+valor, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Milista);
        estado.setAdapter(adaptador);
    }
}