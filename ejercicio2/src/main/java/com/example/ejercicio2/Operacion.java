package com.example.ejercicio2;
public class Operacion {
    private double importe;
    private Persona operador;

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Persona getOperador() {
        return operador;
    }

    public void setOperador(Persona operador) {
        this.operador = operador;
    }

    public boolean esOperacionValida() {

        return importe < 1000;
    }
}