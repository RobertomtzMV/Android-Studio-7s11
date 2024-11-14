package com.user.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    Button btnFrag1, btnFrag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFrag1 = findViewById(R.id.btnA1F1);
        btnFrag2 = findViewById(R.id.btnA1F2);

        Fragment Frag1 = new PrimerFragment();
        Fragment Frag2 = new SegundoFragment();

        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f1 = getSupportFragmentManager().beginTransaction();
                f1.replace(R.id.contenedorFragment, Frag1).commit();
            }
        });

        btnFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f2 = getSupportFragmentManager().beginTransaction();
                f2.replace(R.id.contenedorFragment, Frag2).commit();
            }
        });
    }
}