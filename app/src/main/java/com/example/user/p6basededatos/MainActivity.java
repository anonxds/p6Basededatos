package com.example.user.p6basededatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IOperacionesMat{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void sumarNumeros(int num1, int num2) {

    }

    @Override
    public void restarNumeros(int num1, int num2) {

    }

    @Override
    public void dividirNumeros(int num1, int num2) {

    }

    @Override
    public void multNumeros(int num1, int num2) {

    }
}
