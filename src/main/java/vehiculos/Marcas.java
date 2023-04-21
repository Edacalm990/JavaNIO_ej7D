/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vehiculos;

import java.util.Random;

/**
 *
 * @author venganzaalchocolate
 */
public enum Marcas {
        Renault,Citroën,SEAT,Peugeot,Ford,Opel,Volkswagen,Mercedes;
        
        public static String marcaAleatoria(){
            Random random = new Random ();
            Marcas [] lista = Marcas.values();
            return lista[random.nextInt(lista.length)].toString();
        
        }
}
