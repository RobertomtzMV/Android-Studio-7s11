package com.user.servicio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button iniciar, detener;
    TextView lblcron;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar = findViewById(R.id.btnA1Iniciar);
        detener = findViewById(R.id.btnA1Terminar);
        lblcron = findViewById(R.id.lblA1Cron);

        Cronometro ctro = new Cronometro(getApplicationContext());

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctro.setView(lblcron);
                //ctro.nuevo();
            }
        });

        detener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctro.onDestroy();
            }
        });


    }
}