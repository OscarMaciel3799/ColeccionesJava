package ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        //Las colecciones son estructuras similares a los arreglos, pero con la principal caracteristica de que
        //son dinámicas (su tamaño y cantidad de elementos puede variar en el tiempo

        //Las colecciones se emplean mediante la interfaz "collection" que permite implementar una serie de métodos.
        //Tipos principales de Collections: LIST, SET, QUEUE, MAP


        //LIST
        //Una colección ordenada de elementos que permite duplicados, su tamaño es dinámico.
        //La interfaz List tiene varias implementaciones, como ArrayList, LinkedList y Stack.
        //Permite acceso rápido a elementos, pero la inserción y eliminación pueden ser costosas/lentos.


        //Vamos a crear una coleccion de Personas usando la clase Persona
        //Declaración de Lista
        List<Persona> lista=new ArrayList<Persona>();

        //AGREGAR ELEMENTOS
        lista.add(new Persona(1,"Fulano",73));
        lista.add(new Persona(2,"Mengano",82));
        lista.add(new Persona(3,"Zutano",91));

        //TAMAÑO DE LA LISTA
        System.out.println("Tamaño de la lista: " + lista.size());

        //Para recorrerlo por indice
        System.out.println("RECORRIDO CON FOR");
        for (int i=0; i<lista.size();i++){
            System.out.println("El nombre de la persona en la posicion "+i+" es : " + lista.get(i).getNombre());
        }
        //Para recorrerlo por cada elemento
        System.out.println("RECORRIDO CON FOREACH");
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
