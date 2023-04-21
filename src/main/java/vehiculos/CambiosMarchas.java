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
public enum CambiosMarchas {
    MANUAL, AUTÓMATICO;

    public static String cambioMarcha() {
        CambiosMarchas[] lista = CambiosMarchas.values();
        Random random = new Random();
        if (random.nextBoolean()) {
            return lista[0].toString();
        } else {
            return lista[1].toString();
        }
    }

}
