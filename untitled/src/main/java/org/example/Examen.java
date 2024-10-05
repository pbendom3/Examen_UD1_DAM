package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    public void ejercicio1(){

        Scanner teclado = new Scanner(System.in);
        boolean err=true;
        int num = 0;

        while (err == true) {
            try{
                System.out.println("Introduce un número...");
                num = teclado.nextInt();
                err=false;
            }catch (InputMismatchException e){
                System.out.println("ERROR. Introduce un formato válido...");
                teclado.nextLine();
            }
        }

        if (num<0){
            num = num * -1;
        }

        System.out.println("El valor absoluto es " + num);

    }

    public void ejercicio2 (){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.next();
        System.out.println("La obra de " + nombre);

        boolean err = true;
        int anchop = 0;
        int largop = 0;
        int anchoa = 0;
        int largoa = 0;

        while (err==true){
            try{
                System.out.println("Introduce el ancho de la pared...");
                anchop = teclado.nextInt();
                System.out.println("Introduce el largo de la pared...");
                largop = teclado.nextInt();
                System.out.println("Introduce el ancho del azulejo...");
                anchoa = teclado.nextInt();
                System.out.println("Introduce el largo del azulejo...");
                largoa = teclado.nextInt();

                if (anchop>0 && largop>0 && anchoa>0 && largoa>0){
                    err = false;
                }else{
                    System.out.println("El tamaño no puede ser negativo ò 0... empieza de nuevo.");
                }

            }catch (InputMismatchException e){
                System.out.println("El valor introducido no es correcto... empieza de nuevo.");
                teclado.nextLine();
            }
        }

        if (anchoa==largoa){
            System.out.println("El azulejo no puede ser cuadrado.");
        }else{
            float areap = anchop*largop;
            float areaa = anchoa*largoa;
            float num_azulejos = 0;

            if (areap<areaa){
                System.out.println("El azulejo no puede ser más grande que la pared.");
            }else {
                num_azulejos = areap / areaa;
                System.out.println("Se necesitan " + num_azulejos + " azulejos.");
            }
        }
    }

}
