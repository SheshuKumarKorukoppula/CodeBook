package com.example.codebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CompilerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compiler);
    }

    public void ccode(View view) {
        Uri uri = Uri.parse("https://www.jdoodle.com/c-online-compiler/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void cppcode(View view) {
        Uri uri = Uri.parse("https://www.jdoodle.com/online-compiler-c++17/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void python(View view) {
        Uri uri = Uri.parse("https://www.jdoodle.com/python3-programming-online/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void java(View view) {
        Uri uri = Uri.parse("https://www.jdoodle.com/online-java-compiler/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}