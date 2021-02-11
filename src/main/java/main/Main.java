package main;

import classes.Electrodomestico;
import classes.Televisor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String tipo = "";
        String consumo = "";
        Scanner sc = new Scanner(System.in);
        while (tipo != "N" || tipo != "T"){
            System.out.println("Tipo de electrodomestico a ingresar: N (Nevera) T(Televisor)");
            tipo = sc.next();
        }

        switch (tipo){
            case "T":
                String tamaño;
                Boolean TDT;
                System.out.println("Ingrese el tamaño del televisor");
                tamaño = sc.next();
                System.out.println("Ingrese el TDT: V(Verdadero) F(Falso)");
                TDT = sc.hasNext();
                Electrodomestico televisor = new Televisor()

        }

        String tipo = sc.next();
        switch (tipo){
            case N:
        }

    }
}
