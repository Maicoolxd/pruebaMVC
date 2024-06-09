package org.maicol.mvc.pruebamvc.modelo;

public class Credito {
    private double monto;
    private int plazo;
    private double interes;
    private double pagoMensual;

    public Credito() {}

    public Credito(double monto, int plazo) {
        this.monto = monto;
        this.plazo = plazo;
        this.interes = calcularInteres(plazo);
        this.pagoMensual = calcularPagoMensual();
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
        this.interes = calcularInteres(plazo);
        this.pagoMensual = calcularPagoMensual();
    }

    public double getInteres() {
        return interes;
    }

    private double calcularInteres(int plazo) {
        switch (plazo) {
            case 12:
                return 0.25;
            case 24:
                return 0.45;
            case 36:
                return 0.60;
            case 60:
                return 0.75;
            default:
                return 0;
        }
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    private double calcularPagoMensual() {
        double total = monto * (1 + interes);
        return total / plazo;
    }
}
