package main;

import classes.Electrodomestico;
import classes.Nevera;
import classes.Televisor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int id;
        String tipo = "";
        String consumo = "";
        String procedencia = "";
        Scanner sc = new Scanner(System.in);
        while (tipo != "N" || tipo != "T"){
            System.out.println("Tipo de electrodomestico a ingresar: N (Nevera) T(Televisor)");
            tipo = sc.next();
        }

        System.out.println("Ingrese el ID del electrodomestico");
        id = sc.nextInt();

        while (consumo != "A" || consumo != "B" || consumo != "C"){
            System.out.println("Ingrese el consumo del electrodomestico");
            consumo = sc.next();
        }

        while (procedencia != "N" || procedencia != "I"){
            System.out.println("Ingrese la procedencia del electrodomestico N (Nacional) I (Importado)");
            procedencia = sc.next();
        }

        switch (tipo){
            case "T":
                int tamaño;
                Boolean TDT;
                System.out.println("Ingrese el tamaño del televisor");
                tamaño = sc.nextInt();
                System.out.println("Ingrese el TDT: V(Verdadero) F(Falso)");
                TDT = sc.hasNext();
                Electrodomestico televisor = new Televisor(id,consumo,procedencia,tamaño,TDT);
                System.out.println(televisor.calcularPrecio());
                break;
            case "N":
                int capacidad;
                System.out.println("Ingrese la capacidad de la nevera");
                capacidad = sc.nextInt();
                Electrodomestico nevera = new Nevera(id,consumo,procedencia,capacidad);
                System.out.println(nevera.calcularPrecio());
        }



    }
}
