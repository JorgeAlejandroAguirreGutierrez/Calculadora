/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author joaaguir
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        System.out.println("1. suma, 2. restar, 3. multiplicar, 4. dividir, 5. limpiar, 6. salir");
        opcion = entrada.nextLine();
        double acumulado = 0;
        while(!opcion.equals("6")){
            if(opcion.equals("1")){
                System.out.println("Ingrese el numero 1");
                double numero1 = entrada.nextDouble();
                System.out.println("Ingrese el numero 2");
                double numero2 = entrada.nextDouble();
                double resultado = acumulado + operaciones.sumar(numero1, numero2);
                acumulado = resultado;
                System.out.println(resultado);
            }
            if(opcion.equals("2")){
                System.out.println("Ingrese el numero 1");
                double numero1 = entrada.nextDouble();
                System.out.println("Ingrese el numero 2");
                double numero2 = entrada.nextDouble();
                double resultado = acumulado - operaciones.restar(numero1, numero2);
                acumulado = resultado;
                System.out.println(resultado);
            }
            if(opcion.equals("3")){
                System.out.println("Ingrese el numero 1");
                double numero1 = entrada.nextDouble();
                System.out.println("Ingrese el numero 2");
                double numero2 = entrada.nextDouble();
                double resultado = operaciones.multiplicar(numero1, numero2);
                System.out.println(resultado);
            }
            if(opcion.equals("4")){
                System.out.println("Ingrese el numero 1");
                double numero1 = entrada.nextDouble();
                System.out.println("Ingrese el numero 2");
                double numero2 = entrada.nextDouble();
                double resultado = operaciones.dividir(numero1, numero2);
                System.out.println(resultado);
            }
            if(opcion.equals("5")){
                acumulado = 0;
            }
        }    
    }
    
}
