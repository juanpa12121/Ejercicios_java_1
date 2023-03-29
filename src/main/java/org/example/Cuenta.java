package org.example;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta {" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cantidadIngresada){
        if(cantidadIngresada <= 0){
            System.out.println("El valor introducido " + cantidadIngresada +" es incorrecto en la cuenta de: "+ titular);
        }else{
            cantidad = cantidad + cantidadIngresada;
        }
    }

    public void retirar(double cantidadRetirada){
        if((cantidad-cantidadRetirada) < 0){
            System.out.println("Fondos insuficientes, en la cuenta de: " + titular);
        } else if (cantidadRetirada < 0) {
            System.out.println("Introduzca valores positivos por favor, aqui no prestamos plata");
        } else{
            cantidad = cantidad - cantidadRetirada;
        }
    }
}
