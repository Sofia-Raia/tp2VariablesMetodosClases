package ej20;
import java.util.Scanner;

public class OperacionesFraccion {
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("¡¡¡OPERACIONES CON FRACCIONES!!!");

        System.out.println("Ingrese 2 N° enteros para crear la 1° fracción");
        int num1 =entrada.nextInt();
        int num2 =entrada.nextInt();
        Fraccion f1= new Fraccion(num1,num2);

        System.out.println("Ingrese 2 N° enteros para la 2° fracción");
        int num3 =entrada.nextInt();
        int num4 =entrada.nextInt();
        Fraccion f2= new Fraccion(num3,num4);

        System.out.println("Resultados mátematicos" );

        // Sumar fracciones
        Fraccion suma = Fraccion.sumarFracciones(f1,f2);
        System.out.println("Suma: " + suma);

        // Restar fracciones
        Fraccion resta = Fraccion.restarFracciones(f1,f2);
        System.out.println("Resta: " + resta);

        // Multiplicar fracciones
        Fraccion multiplicacion = Fraccion.multiplicarFracciones(f1,f2);
        System.out.println("Multiplicación: " + multiplicacion);

        // Dividir fracciones
        Fraccion division = Fraccion.dividirFracciones(f1,f2);
        System.out.println("División: " + division);

    }

    }
