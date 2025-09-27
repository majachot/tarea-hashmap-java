/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea.hashmap;

/**
 *
 * @author Soluciones
 */
import java.util.HashMap;

public class TareaHashmap {

    public static void main(String[] args) {
         // 1. Crear el mapa
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("nombre", "José Torres");
        informacionPersonal.put("edad", 35);
        informacionPersonal.put("ciudad", "QUITO");

        // 2. Acceder y modificar valores
        // Cambiar "ciudad"
        informacionPersonal.put("ciudad", "GUAYAS");

        // Agregar "profesion"
        informacionPersonal.put("profesion", "Tecnologo en Electrónica");

        // 3. Verificar existencia de claves
        if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.putIfAbsent("telefono", "02263721");
        }

        // 4. Eliminar una clave
        informacionPersonal.remove("edad");

        // 5. Imprimir el resultado
        System.out.println("Contenido final del HashMap:");
        for (String clave : informacionPersonal.keySet()) {
            System.out.println(clave + ": " + informacionPersonal.get(clave));
        }
    }
}
    
