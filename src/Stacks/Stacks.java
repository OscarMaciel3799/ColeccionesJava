package Stacks;

import LinkedList.Persona;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        /*
        Una pila (o stack) es una estructura de datos que sigue el principio LIFO (Last In, First Out),
        lo que significa que el último elemento agregado es el primero en ser retirado.
         */

        //DECLARAR UN STACK
        Stack<Integer> pila = new Stack<Integer>();

        //AGREGAR ELEMENTOS A LA PILA
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //TAMAÑO DE LA PILA
        System.out.println("Tamaño de la lista: " + pila.size());

        //recorrerlos por cada elemento
        System.out.println("RECORRIDO CON FOREACH");
        for(Integer elem: pila){
            System.out.println(elem);
        }

        //ELIMINAR EL ULTIMO ELEMENTO
        pila.pop();
        System.out.println("PILA DESPUES DE ELIMINAR UN ELEMENTO");
        for(Integer elem: pila){
            System.out.println(elem);
        }

        //BUSCAR UN ELEMENTO EN LA PILA
        System.out.println("Cual es la posicion del numero 2? : "+ pila.search(2));

        //OBTENER EL ULTIMO ELEMENTO DE LA pila
        System.out.println("El ultimo elemento de la lista es: "+ pila.peek());


        //EVALUAR SI LA PILA ESTA VACIA
        System.out.println("La pila esta vacia? "+ pila.isEmpty());
    }
}
