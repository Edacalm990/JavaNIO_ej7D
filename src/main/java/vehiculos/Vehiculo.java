/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eli
 */
public abstract class Vehiculo {
        // atributos encapsulados de vehiculo
    private String bastidor;
    private String matricula;
    private boolean estaEncendido;
    private String marca;

    public Vehiculo() {
        this.bastidor = RandomStringUtils.randomAlphanumeric(10);
        this.matricula = RandomStringUtils.randomAlphanumeric(5);
        this.marca= Marcas.marcaAleatoria();
    }
    
    public Vehiculo(String marca, String bastidor, String matricula ) {
        this.marca=marca;
        this.bastidor = bastidor;
        this.matricula = matricula;
        
    }
    
    

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
    
    

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public abstract void encender();
    public abstract void apagar();

    @Override
    public String toString() {
        return "%s:%s:%s".formatted(marca,bastidor,matricula);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
