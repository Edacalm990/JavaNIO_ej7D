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
public class Turismo extends Vehiculo{
    // número de puertas y el tipo de cambio de marcha
    private Random random = new Random();
    private int numPuertas;
    private String tipo;

    public Turismo() {
        this.numPuertas=random.nextInt(5);
        this.tipo= CambiosMarchas.cambioMarcha();
    }


    public Turismo(String marca, String bastidor, String matricula,int numPuertas, String tipo) {
        super(marca, bastidor, matricula);
        this.numPuertas = numPuertas;
        this.tipo = tipo;
    }
    
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "%s:%s:%s".formatted(super.toString(),numPuertas, tipo);
    }

    @Override
    public void encender() {
        System.out.println("El turismo hace brum brum");
        this.setEstaEncendido(true);
    }

    @Override
    public void apagar() {
        System.out.println("El turismo se apaga");
        this.setEstaEncendido(false);
    }
    
    
}
