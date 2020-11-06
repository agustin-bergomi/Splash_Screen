package com.agustinbergomi.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creamos un nuevo thread porque es una operacion que dura varios segundos en la GUI
        Thread splash = new Thread() {
            public void run() {
                try {
                    sleep(3 * 1000);
                    //se muestra 3 segundos la activity main con la imagen.
                    //cuando termina se inicia start activity con el intent que lleva a la HomePage.
                    Intent i = new Intent(getBaseContext(), HomePage.class);
                    startActivity(i);
                    finish();

                } catch (Exception e) {
                }
            }
        };
        //se inicializa el thread
        splash.start();
    }
}