package com.example.monappli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class pagePerdu extends AppCompatActivity {

    private EditText textPseudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_perdu);

        textPseudo = findViewById(R.id.textPseudo);
    }
}