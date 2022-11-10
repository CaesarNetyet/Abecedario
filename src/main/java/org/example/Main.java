package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int opcion;
        Arreglos a = new Arreglos();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("ingresa una de las diferentes opciones");
            System.out.println("1) ver el abecedario");
            System.out.println("2) encontrar letra en el abecedario");
            System.out.println("3) agregar letra al abecedario");
            System.out.println("4) eliminar letra al abecedario");
            System.out.println("5) modificar letra del abecedario");
            System.out.println("6) creditos");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> a.mostrarAbecedario();
                case 2 -> {
                    System.out.println("ingresa la letra que quieres encontrar");
                    char letra = scanner.next().charAt(0);
                    if (a.encontrarLetra(letra) == -1) {
                        System.out.println("la letra no se encuentra en el abecedario");
                    } else {
                        System.out.println("la letra se encuentra en la posicion " + a.encontrarLetra(letra));
                    }
                }
                case 3 -> {
                    System.out.println("ingresa la letra que quieres agregar");
                    char letraAgregar = scanner.next().charAt(0);
                    a.insertarLetra(letraAgregar);
                }
                case 4 -> {
                    System.out.println("ingresa la letra que quieres eliminar");
                    char letraEliminar = scanner.next().charAt(0);
                    a.eliminarLetra(letraEliminar);
                }
                case 5 -> {
                    System.out.println("ingresa la letra que quieres cambiar");
                    char letraCambiar = scanner.next().charAt(0);
                    if (a.encontrarLetra(letraCambiar) == -1) {
                        System.out.println("la letra no se encuentra en el abecedario");
                    } else {
                        System.out.println("ingresa la letra nueva letra");
                        char letraNueva = scanner.next().charAt(0);
                        a.modificarLetra(letraCambiar, letraNueva);
                    }
                }
                case 6 -> System.out.println("Hecho por: Julio Cesar Tovar");
            }

        }


    }
}