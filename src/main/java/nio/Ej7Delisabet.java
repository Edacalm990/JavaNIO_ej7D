/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import vehiculos.Deportivo;
import vehiculos.Furgoneta;
import vehiculos.Turismo;
import vehiculos.Vehiculo;

/**
 *
 * @author eli
 */
/*
    Copiar los tres ficheros *.csv a un directorio previamente creado en “./copias”.
    Mostrar los ficheros contenidos en “copias”.
    Leer los ficheros de la carpeta “copias” e ir guardando los objetos en una lista de vehículos.
    Imprimir la lista por pantalla. 
    Ordena la lista por bastidor.
    Imprimir la lista ordenada.
    Borrar los ficheros *.csv originales.
    Mostrar el contenido de la carpeta donde estaban los *.csv originales.
    Usando Streams, realiza las siguientes acciones sobre la lista de vehículos:
    Imprime por pantalla todas las matrículas ordenadas alfabéticamente de todos  los coches grises distintos
    Imprime por pantalla todas las marcas de coches distintas de aquellos coches que estén disponibles.
    Saber la cantidad de vehículos Citroën.
    Comprobar si hay algún Peugeot negro disponible en la lista.
    Obtener una lista con todas las tarifas diferentes que se aplican a los vehículos.
*/
public class Ej7Delisabet {

    public static void main(String[] args) {

        //  lista de Vehículos los objetos leídos de cada fichero. 
        List<Vehiculo> listaVehiculos = crearListaVehiculos();
        // Creación de un directorio en el directorio actual del proyecto
        ServiciosFichero.crearDirectorio("./copias");
        // Mostrar los ficheros contenidos en “copias”.
        
        // Leer los ficheros de la carpeta “copias” e ir guardando los objetos en una lista de vehículos.
        String [] listaFicheros= {"turismos.txt", "deportivos.txt", "furgonetas.txt"};
        for (int i = 0; i < listaFicheros.length; i++) {
            ServiciosFichero.copiarFicheros("./%s".formatted(listaFicheros[i]), "./copia/%s".formatted(listaFicheros[i]));
        }
    }

    public static List<Vehiculo> crearListaVehiculos() {
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        String[] listaFicheros = {"turismos.txt", "deportivos.txt", "furgonetas.txt"};
        try {
            for (int i = 0; i < 3; i++) {
                List<String> lines = Files.readAllLines(Paths.get("./%s".formatted(listaFicheros[i])),
                        StandardCharsets.UTF_8);

                for (String linea : lines) {
                    String[] lista = linea.split(":");
                    listaVehiculos.add(crearVehiculo(i, lista));
                }
            }
            
        } catch (Exception e) {
        }
return listaVehiculos;
    }

    public static Vehiculo crearVehiculo(int i, String[] lista) {
        try {
            switch (i) {
                case 0 -> {
                    return (new Turismo(lista[0].substring(4), lista[1], lista[2], Integer.parseInt(lista[3]), lista[4]));
                }
                case 1 -> {
                    return (new Deportivo(lista[0].substring(4), lista[1], lista[2], Double.parseDouble(lista[3])));
                }
                case 2 -> {
                    return (new Furgoneta(lista[0].substring(4), lista[1], lista[2], Integer.parseInt(lista[3]), Double.parseDouble(lista[4])));
                }
                default ->
                    throw new AssertionError();
            }
        } catch (Exception e) {
            return null;
        }
    }
}
