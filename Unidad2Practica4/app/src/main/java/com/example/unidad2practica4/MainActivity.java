package com.example.unidad2practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ImageView img_1, img_2,img_3,img_4,img_5;
    private Map<Integer, Detalle> datos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_1=findViewById(R.id.im_1);
        img_2=findViewById(R.id.im_2);
        img_3=findViewById(R.id.im_2);
        img_4=findViewById(R.id.im_3);
        img_5=findViewById(R.id.im_4);
        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
                int id=view.getId();
                Detalle valores=datos.get(id);
                intent.putExtra("datos", valores);

                startActivity(intent);

            }
        };
        img_1.setOnClickListener(click);
        img_2.setOnClickListener(click);
        img_3.setOnClickListener(click);
        img_4.setOnClickListener(click);
        img_5.setOnClickListener(click);
        datos=new HashMap<>();

        datos.put(R.id.im_1, new Detalle("Imagen 1 de solo leveling", "imagen de solo leveling 1", R.drawable.img1));
        datos.put(R.id.im_2, new Detalle("Imagen 2 de solo leveling", "imagen de solo leveling 2", R.drawable.img2));
        datos.put(R.id.im_3, new Detalle("Imagen 3 de solo leveling", "imagen de solo leveling 3", R.drawable.img3));
        datos.put(R.id.im_4, new Detalle("Imagen 4 de solo leveling", "imagen de solo leveling 4", R.drawable.img4));
        datos.put(R.id.im_5, new Detalle("Imagen 5 de solo leveling", "imagen de solo leveling 5", R.drawable.img5));


    }
}