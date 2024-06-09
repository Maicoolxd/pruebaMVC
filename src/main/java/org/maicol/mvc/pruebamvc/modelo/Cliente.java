package org.maicol.mvc.pruebamvc.modelo;

public class Cliente {
    private String nombre;
    private String sexo;
    private int edad;
    private double sueldoMensual;

    public Cliente() {}

    public Cliente(String nombre, String sexo, int edad, double sueldoMensual) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
