package com.example.u2practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText edNum1, edNum2;
private TextView tvResultado;
private Button btResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNum1=findViewById(R.id.edNum1);
        edNum2=findViewById(R.id.edNum2);
        tvResultado=findViewById(R.id.tvResultado);
        btResultado=findViewById(R.id.btnSumar);

        btResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2, res;
                n1=Integer.valueOf(edNum1.getEditableText().toString());
                n2=Integer.valueOf(edNum2.getEditableText().toString());
                res=n1+n2;
                tvResultado.setText(String.valueOf(res));
            }
        });






    }
}