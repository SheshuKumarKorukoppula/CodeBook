package com.example.codebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void compilers(View view) {
        startActivity(new Intent(WelcomeActivity.this,CompilerActivity.class));
    }

    public void concepts(View view) {
        startActivity(new Intent(WelcomeActivity.this,ConceptsActivity.class));
    }
}