package com.example.user.p6basededatos;

public abstract class OperacionesMat {
    int numero1=6;
    int numero2=7;

    public int sumarNumeros(){
      return   numero1+numero2;
    }

    public abstract int restarNumeros();
}
