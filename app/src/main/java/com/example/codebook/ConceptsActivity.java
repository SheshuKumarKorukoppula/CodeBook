package com.example.codebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConceptsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepts);
    }

    public void ccode(View view) {
        startActivity(new Intent(ConceptsActivity.this,CActivity.class));
    }

    public void cppcode(View view) {
        startActivity(new Intent(ConceptsActivity.this,CppActivity.class));
    }

    public void python(View view) {
        startActivity(new Intent(ConceptsActivity.this,PyActivity.class));
    }

    public void java(View view) {
        startActivity(new Intent(ConceptsActivity.this,JavaActivity.class));
    }
}