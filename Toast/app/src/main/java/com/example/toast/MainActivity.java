package com.example.toast;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button lanzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lanzar = findViewById(R.id.btnA1Lanzar);

        lanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LanzarToast();
            }
        });
    }

    public void LanzarToast(){
        LayoutInflater l = this.getLayoutInflater();
        View v = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));
        Toast t = new Toast(getApplicationContext());
        t.setGravity(Gravity.CENTER_HORIZONTAL, 10, 0);
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(v);
        t.show();
    }
}