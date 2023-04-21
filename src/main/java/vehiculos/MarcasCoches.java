/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vehiculos;

import java.util.Random;

/**
 *
 * @author eli
 */
public enum MarcasCoches {

    Peugeot, Renault, Opel, Citroën, Ford, Nissan, Kia, Hyundai;

    public static String randomMarca() {
        Random random = new Random();
        MarcasCoches[] listaMarcas = MarcasCoches.values();
        return listaMarcas[random.nextInt(listaMarcas.length - 1)].toString();
    }
}
