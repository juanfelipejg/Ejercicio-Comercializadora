package menu;

import classes.Electrodomestico;
import classes.Nevera;
import classes.Televisor;

import java.util.Scanner;

public class Menu {

    boolean salir = false;
    int opcion;
    int id;
    Scanner sc = new Scanner(System.in);

    public Menu() {

    }

    public void mostrarMenu(){
        while(!salir){
            System.out.println("1.Ingresar electrodomestico");
            System.out.println("2.Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el ID del electrodomestico");
                    id = sc.nextInt();
                    System.out.println("Ingrese el consumo (A-B-C)");
                    String consumo = sc.next();
                    while(!validarConsumo(consumo)){
                        System.out.println("Ingrese una opción valida A, B o C");
                        consumo = sc.next();
                    }
                    System.out.println("Ingrese la procedencia del electrodomestico N:Nacional I:Importado)");
                    String procedencia = sc.next();
                    while (!validarProcedencia(procedencia)){
                        System.out.println("Ingrese una procedencia valida N: Nacional o I: Importado");
                        procedencia = sc.next();
                    }
                    System.out.println("Ingrese el tipo de electrodomestico N(Nevera) T(Television)");
                    String tipo = sc.next();
                    while (!validarTipo(tipo)){
                        System.out.println("Ingrese una opción valida N:Nevera o  T:Television");
                        tipo = sc.next();
                    }
                    switch (tipo){
                        case "N":
                            System.out.println("Ingrese la capacidad de la nevera");
                            int capacidad = sc.nextInt();
                            Electrodomestico nevera = new Nevera(id,consumo,procedencia,capacidad);
                            System.out.println("El precio de la nevera es: " + nevera.calcularPrecio());
                            break;
                        case "T":
                            System.out.println("Ingrese el tamaño del televisor");
                            int tamaño = sc.nextInt();
                            System.out.println("Ingrese si posee TDT: V:Verdadero F:Falso");
                            String opcionTDT = sc.next();
                            while(!validarOpcionTDT(opcionTDT)){
                                System.out.println("Ingresa una opción valida V:Verdadero F:Falso");
                                opcionTDT = sc.next();
                            }
                            boolean tdt = validarTDT(opcionTDT);
                            Electrodomestico televisor = new Televisor(id,consumo,procedencia,tamaño,tdt);
                            System.out.println("El precio del televisor es: " + televisor.calcularPrecio());
                            break;
                    }

            }
        }
    }

    public boolean validarConsumo (String opcionConsumo) {
        if(opcionConsumo.equalsIgnoreCase("A")){
            return true;
        }else if (opcionConsumo.equalsIgnoreCase("B")){
            return true;
        }else if (opcionConsumo.equalsIgnoreCase("C")){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarProcedencia(String opcionProcedencia) {
        if(opcionProcedencia.equalsIgnoreCase("N")){
            return true;
        }else if (opcionProcedencia.equalsIgnoreCase("I")){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarTipo(String opcionTipo) {
        if(opcionTipo.equalsIgnoreCase("N")){
            return true;
        }else if (opcionTipo.equalsIgnoreCase("T")){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarOpcionTDT(String opcionTDT) {
        if(opcionTDT.equalsIgnoreCase("V")){
            return true;
        }else if (opcionTDT.equalsIgnoreCase("F")){
            return true;
        }else{
            return false;
        }
    }


    public boolean validarTDT (String opcionTDT){
        if(opcionTDT.equalsIgnoreCase("V")){
            return true;
        }else{
            return false;
        }
    }
}
