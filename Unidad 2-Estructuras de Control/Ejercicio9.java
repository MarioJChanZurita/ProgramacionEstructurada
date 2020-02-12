/*
Autor: Pedro Cauich
Entrada: número del día de la semana que se quiere
Salida: nombre del día
*/

import java.util.Scanner;

public class Main{
    public static void main(String arg[]) {

        // Definir variables [Entradas]
        Scanner entrada = new Scanner(System.in);
        int multiplos = 0;
        int resultado = 0;
        int limite = 0;

        System.out.println("Ingrese un número");
        try {
            limite = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Ese es un dato no válido");
        }

        //Bucle para los múltiplos y validación[Procedimiento] 
        if (limite < 5){
            System.out.println("0");
            System.exit(0);
         } else if(limite >= 5) {
             multiplos = limite/5;
         }

         //Impresión de salidas[Salida]
         System.out.println(multiplos);
    }
}

