package com.example.unidad2practica5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Thread hilo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                while (hilo!=null){
                    mostrarNotif("hola mundo");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
    }
    public void mostrarNotif(String texto){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this);
                builder.setSmallIcon(R.drawable.ic_launcher_foreground);
                builder.setContentTitle(texto);
                builder.setContentText(texto);
                NotificationManager manager =(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(10, builder.build());

            }
        });

    }


}