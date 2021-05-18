package com.example.olaandroidera;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarMensagem(View view) {
        Toast toast = Toast.makeText(this, "Olá!", Toast.LENGTH_SHORT);
        toast.show();
    }
}


