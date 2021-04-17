package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class relativlayout extends AppCompatActivity {

    EditText NamaLengkap;
    Button Done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativlayout);

        NamaLengkap = findViewById(R.id.NamaLengkap);
        Done = findViewById(R.id.done);

    }
}