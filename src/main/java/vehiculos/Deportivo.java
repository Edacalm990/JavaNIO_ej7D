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
public class Deportivo extends Vehiculo{
    private double cilindrada;
    Random random= new Random();

    public Deportivo() {
        this.cilindrada=random.nextDouble(50);
    }


    public Deportivo(String marca, String bastidor, String matricula,double cilindrada) {
        super(marca, bastidor, matricula);
        this.cilindrada = cilindrada;
    }


    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
       return "%s:%s".formatted(super.toString(), cilindrada);
    }

    @Override
    public void encender() {
        System.out.println("El Deportivo hace bruuuuum bruuuuuum");
        this.setEstaEncendido(true);
    }

    @Override
    public void apagar() {
        System.out.println("El Deportivo se apaga");
        this.setEstaEncendido(false);
    }
    
    
}
