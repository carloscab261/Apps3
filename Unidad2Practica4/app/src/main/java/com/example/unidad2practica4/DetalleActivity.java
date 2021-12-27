package com.example.unidad2practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {
private TextView tvTitulo, tvDescripcion;
private ImageView imLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        tvTitulo = findViewById(R.id.tv_titulo);
        tvDescripcion = findViewById(R.id.tv_descripcion);
        imLogo=findViewById(R.id.im_logo);

        Detalle valores= (Detalle) getIntent().getSerializableExtra("datos");
        tvTitulo.setText(valores.getTitulo());
        tvDescripcion.setText(valores.getDescripcion());
        imLogo.setImageResource(valores.getLogoid());

    }
}