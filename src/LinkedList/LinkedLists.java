package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        /*
        A diferencia de ArrayList, que utiliza un array dinámico para almacenar elementos,
        LinkedList utiliza una estructura de datos de lista enlazada,
        donde cada elemento (o nodo) contiene una referencia al siguiente y al anterior.
        Esto permite una inserción y eliminación más eficiente en comparación con ArrayList,
        specialmente en operaciones que no son al final de la lista.
        */

        //Declarar una LinkedList
        LinkedList<Persona> lista= new LinkedList<Persona>();

        //AGREGAR ELEMENTOS AL FINAL DE LA LISTA
        lista.add(new Persona(1,"Fulano",73));
        lista.add(new Persona(2,"Mengano",82));
        lista.add(new Persona(3,"Zutano",91));

        //TAMAÑO DE LA LISTA
        System.out.println("Tamaño de la lista: " + lista.size());

        //Aunque se pueda recorrer por indice con un for tradicional,
        // los LinkedList estan pensado para recorrerlos por cada elemento
        System.out.println("RECORRIDO CON FOREACH");
        for(Persona perso: lista){
            System.out.println("El nombre de la persona es : " + perso.getNombre());
        }
        //AGREGAR ELEMENTOS AL PRINCIPIO DE LA LISTA
        System.out.println("AGREGAMOS UN ELEMENTO AL INICIO");
        lista.addFirst(new Persona(7,"Carlitos",87));
        for(Persona perso: lista){
            System.out.println("El nombre de la persona es : " + perso.getNombre());
        }

        //AGREGAR ELEMENTOS EN LA POSICION ESPECIFICADA
        System.out.println("AGREGAMOS UN ELEMENTO EN LA POSICION 2");
        lista.add(2,new Persona(5,"Juancito",69));
        for(Persona perso: lista){
            System.out.println("El nombre de la persona es : " + perso.getNombre());
        }

        //MODIFICAR UN ELEMENTO
        lista.set(0, new Persona(1,"Pepita",102));
        System.out.println("LISTA MODIFICADA");
        for(Persona perso: lista){
            System.out.println("El nombre de la persona es : " + perso.getNombre());
        }

        //ELIMINAR UN ELEMENTO
        lista.remove(1);
        System.out.println("LISTA DESPUES DE ELIMINAR UN ELEMENTO");
        for(Persona perso: lista){
            System.out.println("El nombre de la persona es : " + perso.getNombre());
        }

        //OBTENER EL PRIMER Y ULTIMO ELEMENTO DE LA LISTA
        System.out.println("El primer elemento de la lista es: "+ lista.getFirst().toString());
        System.out.println("El ultimo elemento de la lista es: "+ lista.getLast().toString());


        //LIMPIAR LA LISTA
        lista.clear();
        System.out.println("LISTA LUEGO DE LIMPIARLA");
        for(Persona perso: lista){
            System.out.println("El nombre de la persona es : " + perso.getNombre());
        }

        //EVALUAR SI LA LISTA ESTA VACIA
        System.out.println("La lista esta vacia? "+ lista.isEmpty());
    }
}
