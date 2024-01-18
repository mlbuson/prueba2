package com.example.ejercicio2;
import java.time.LocalDate;
public class Tarjeta {
    private String marca;
    private String numero;
    private String cardholder;
    private LocalDate fechaVencimiento;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String obtenerInformacion() {
        return String.format("tarjetas.Tarjeta %s, Número: %s, Titular: %s, Vencimiento: %s",
                marca, numero, cardholder, fechaVencimiento);
    }
    public Tarjeta() {
        marca="";
        numero="";
        cardholder="" ;
        fechaVencimiento =  LocalDate.of (2024,5,1);
    }
    public Tarjeta(String marca, String numero, String cardholder, Integer year, Integer month, Integer day) {
        this.marca = marca;
        this.numero= numero;
        this.cardholder= cardholder;
        this.fechaVencimiento =  LocalDate.of (year,month,day);
    }

}
