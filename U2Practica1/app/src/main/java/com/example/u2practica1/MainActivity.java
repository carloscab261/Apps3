package com.example.u2practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMostrar = findViewById(R.id.btn_mostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edTexto = edTexto = findViewById(R.id.edtx_texto1);
                Toast.makeText( MainActivity.this, "Hola mundo:  " + edTexto.getEditableText().toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}