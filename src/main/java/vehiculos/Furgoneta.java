/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Random;

/**
 *
 * @author eli
 */
public class Furgoneta extends Vehiculo{
    private int capacidad;
    private double volumen;
    private Random random=new Random();

    public Furgoneta() {
        this.capacidad = random.nextInt(100);
        this.volumen = random.nextDouble(100);
    }

    public Furgoneta(String marca, String bastidor, String matricula, int capacidad, double volumen ) {
        super(marca, bastidor, matricula);
        this.capacidad = capacidad;
        this.volumen = volumen;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getBastidor() {
        return getBastidor();
    }

    public void setBastidor(String bastidor) {
        this.setBastidor(bastidor);
    }

    public String getMatricula() {
        return getMatricula();
    }

    public void setMatricula(String matricula) {
        this.setMatricula(matricula);
    }

    @Override
    public String toString() {
        return "%s:%s:%s".formatted(super.toString(), capacidad, volumen);
    }

    @Override
    public void encender() {
         System.out.println("La furgoneta hace bruabrabrum bruabrabrum");
        this.setEstaEncendido(true);
    }

    @Override
    public void apagar() {
         System.out.println("La furgoneta se apaga");
        this.setEstaEncendido(false);
    }
    
    
    
}
