package Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        //  Un Map es una estructura de datos que almacena pares de clave-valor.
        // Cada clave es única y se utiliza para acceder al valor asociado y tiene varias implementaciones,
        // siendo las más comunes HashMap, TreeMap y LinkedHashMap.

        //HashMap
        //Declarar hashMap
        Map<Integer, String> mapaEmpleados = new HashMap<>();

        //Agregar elementos
        mapaEmpleados.put(1110,"Charly Garcia");
        mapaEmpleados.put(1111,"Alberto Olmedo");
        mapaEmpleados.put(1112,"Luca Prodan");
        mapaEmpleados.put(1113,"Carlos Gardel");

        //Mostramos los elementos del mapa
        System.out.println(mapaEmpleados);

        //Obtener elementos
        System.out.println("El el empleado asociado al codigo 1111 es: "+ mapaEmpleados.get(1111));

        //Eliminar elementos
        mapaEmpleados.remove(1110);

        //Valores Actuales en el mapa
        System.out.println(mapaEmpleados);

        //Verificar si contiene una clave o un valor
        System.out.println("Contiene la clave 1115? : "+ mapaEmpleados.containsKey(1115));
        System.out.println("Contiene al empleado \"Luca Prodan\"? : " + mapaEmpleados.containsValue("Luca Prodan"));

        //Tamaño del mapa
        System.out.println("El tamaño del mapa es: "+ mapaEmpleados.size());

        //Obtener todas las claves o valores
        System.out.println("Todas las claves son : " + mapaEmpleados.keySet());
        System.out.println("Todos los valores son: "+ mapaEmpleados.values());

        //Obtener todas las entradas (pares clave-valor)
        System.out.println(mapaEmpleados.entrySet());

        //Limpiar el mapa
        mapaEmpleados.clear();

        //Evaluamos su está vacio
        System.out.println("El mapa está vacio? "+ mapaEmpleados.isEmpty());
    }
}
