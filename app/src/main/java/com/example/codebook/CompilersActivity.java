package com.example.codebook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CompilersActivity extends AppCompatActivity {

    Button btnC, btnCpp, btnPython, btnJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compilers);

        btnC = findViewById(R.id.btnC);
        btnCpp = findViewById(R.id.btnCpp);
        btnPython = findViewById(R.id.btnPython);
        btnJava = findViewById(R.id.btnJava);

        btnC.setOnClickListener(v -> {
            Intent intent = new Intent(CompilersActivity.this, CCompilerActivity.class);
            startActivity(intent);
        });

        btnCpp.setOnClickListener(v -> {
            Intent intent = new Intent(CompilersActivity.this, CppCompilerActivity.class);
            startActivity(intent);
        });

        btnPython.setOnClickListener(v -> {
            Intent intent = new Intent(CompilersActivity.this, PythonCompilerActivity.class);
            startActivity(intent);
        });

        btnJava.setOnClickListener(v -> {
            Intent intent = new Intent(CompilersActivity.this, JavaCompilerActivity.class);
            startActivity(intent);
        });
    }
}