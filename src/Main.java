
import ej19.Calculo;
import ej20.OperacionesFraccion;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        //Logica l = new Logica();
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("""
                               INGRESE LA OPCIÓN QUE DESEE:
                               1- Casteo.
                               2- Dos posibles formas de verificacion(variables fuera de rango).
                               3- Suma de tres digitos.
                               4- Contador de billetes y monedas.
                               5- Numero entero a String.
                               6- Longitud frase.
                               7- Contador de vocales.
                               8- Reemplazo de vocales.
                               9- Codigo ASCII.
                               10- Frase a mayusculas y minusculas.
                               11- Comparar si dos palabras son iguales.
                               12- Extraer 4ta y 5ta letra de una palabra. 
                               13- Comprobar si una cadena esta dentro de otra. 
                               14- Diferencia entre datos por valor (primitivos) y por referencia. 
                               15- Concepto de null. 
                               16- Variable de tipo Double a tipo double. 
                               17- Fecha de tipo Date a cadena. 
                               18- Ingreso de dia, mes y año para devolver fecha tipo Date. 
                               19- Ir a clase Calculo (main). 
                               20- Ir a clase OperacionesFraccion (main). 
                               21- Suma desde el num ingresado hasta 1 (recursión). 
                               22- Suma de los digitos de un numero (recursión). 
                               23- Cadena invertida (recursión). 
                               0- SALIR. """);
            
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> Logica.funCaste();
                case 2 -> {
                    Logica.punto2();
                    Logica.verificacion();
                    Logica.verificacion1();
                }
                case 3 -> Logica.sum();
                case 4 -> Logica.caja();
                case 5 -> Logica.punto5();
                case 6 -> Logica.punto6();
                case 7 -> Logica.punto7();
                case 8 -> Logica.punto8();
                case 9 -> Logica.punto9();
                case 10 -> Logica.punto10();
                case 11 -> Logica.punto11();
                case 12 -> Logica.punto12();
                case 13 -> Logica.punto13();
                case 14 -> Logica.punto14();
                case 15 -> Logica.punto15();
                case 16 -> Logica.punto16();
                case 17 -> Logica.punto17();
                case 18 -> Logica.punto18();
                case 19 -> Calculo.main();
                case 20 -> OperacionesFraccion.main();
                case 21 -> Logica.punto21();
                case 22 -> Logica.punto22();
                case 23 -> Logica.punto23();
            }
            
        } while (opcion!=0);

    }

}