import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.math.BigInteger;

import static java.lang.Integer.parseInt;

public class Logica {

    private static final Scanner l = new Scanner(System.in);
    private static FuncionesPrograma Funciones;


    public static void funCaste() {
        double valorDecimal;
        String op;
        
        System.out.println("- CONVERSOR DE TIPO DE DATOS (CASTING) -");
        
        System.out.print("Ingrese un numero decimal (con punto): ");
        valorDecimal = Double.parseDouble(l.nextLine());
        
        System.out.println("Seleccione a que tipo de dato quiere convertir:");
        System.out.println("""
                           1- Entero (Int)
                           2- Entero corto (Short)
                           3- Entero largo (Long)
                           4- Real (Float)
                           5- Cadena (String)""");
        op = l.nextLine();
        
        switch (op) {
            case "1":
                int numInt = (int)valorDecimal;
                System.out.println("El valor "+ valorDecimal + " convertido a entero es: " + numInt);
                break;
                
            case "2":
                short numShort = (short)valorDecimal;
                System.out.println("El valor "+ valorDecimal + " convertido a entero corto es: " + numShort);
                break;
                
            case "3":
                long numLong = (long)valorDecimal;
                System.out.println("El valor "+ valorDecimal + " convertido a entero largo es: " + numLong);
                break;
                
            case "4":
                float numFloat = (float)valorDecimal;
                System.out.println("El valor "+ valorDecimal + " convertido a real es: " + numFloat);
                break;
                
            case "5":
                String cadena = String.valueOf(valorDecimal);
                System.out.println("El valor "+ valorDecimal + " convertido a cadena es: " + cadena);
                break;
                
            default:
                System.out.println("Invalido");
                
        }
    }
    
    public static void punto2 () {
        
        System.out.println(" Si se asigna un valor  a una variable fuera de rango (mayor de lo establecido) \n" +
                           " ¿Qué ocurre? ¿Existe alguna forma de resolverlo?");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("""
                           Se produce un Overflow o desbordamiento, un byte va de -128 a 127
                           si yo le asigno el valor 130 se va a tratar de convertir a un numero
                           que este dentro del rango ej -125.
                           
                           Para solucionar esto:
                           1. Verificación manual de los límites antes de la asignación.
                           2. Usar tipos de datos más grandes.
                           3. Uso de la clase Math para prevenir el overflow.
                           4. Usar tipos no primitivos (BigInteger o BigDecimal)
                           """);
    }
    
    //ejemplo del punto 2
    public static void verificacion() {
        
        int val = 130;  // El valor que deseas asignar
        
        System.out.println("- VERIFICACIÓN 1 -");
        System.out.println("-------------------------");
        System.out.println("Ejemplo con numero 130:");
        
        if (val < Byte.MIN_VALUE || val > Byte.MAX_VALUE) {
            System.out.println("El valor está fuera del rango permitido para byte");
        } else {
            byte b = (byte) val;
            System.out.println("El valor asignado es: " + b);
        }
        System.out.println();
    }

    //otro ejemplo del punto 2
    public static void verificacion1() {
        
        System.out.println("- VERFICACIÓN 2 -");
        System.out.println("-------------------------");
        System.out.println("""
                           BigInteger bigValue = new BigInteger("130");
                           System.out.println(bigValue); --> Imprime 130
                           """);
//        BigInteger bigValue = new BigInteger("130");
//        System.out.println(bigValue);  // Imprime 130
    }

    public static void sum() {
        int n = 0;

        do {
            System.out.print("Ingresa un número de 3 dígitos (100 - 999): ");
            n = l.nextInt();

        } while (n < 100 || n > 999);
        // Extraer los dígitos usando módulo y división
        int unidad = n % 10;          // Obtener el dígito de las unidades
        int decena = (n / 10) % 10;   // Obtener el dígito de las decenas
        int centena = (n / 100);      // Obtener el dígito de las centenas

        // Sumar los dígitos
        int suma = unidad + decena + centena;

        // Mostrar el resultado
        System.out.println("La suma de los dígitos es: " + suma);


    }

    public static void caja() {

        // Solicitar la cantidad de dinero
        System.out.print("Ingrese la cantidad de dinero (por ejemplo, 1390,55): ");
        double cantidad = l.nextDouble();

        // Separar la parte entera de la parte decimal
        int parteEntera = (int) cantidad;  // Parte en billetes y monedas enteras
        int parteDecimal = (int) Math.round((cantidad - parteEntera) * 100);  // Parte en centavos

        // Denominaciones de billetes y monedas
        int[] billetes = {200, 100, 50, 20, 10, 5, 2, 1};
        double[] monedas = {0.50, 0.25, 0.10, 0.05};

        // Calcular la cantidad de billetes
        System.out.println("Billetes y monedas necesarias:");
        for (int billete : billetes) {
            if (parteEntera >= billete) {
                int numBilletes = parteEntera / billete;
                parteEntera = parteEntera % billete;
                System.out.println(numBilletes + " billete(s) de " + billete);
            }
        }

        // Calcular la cantidad de monedas
        for (double moneda : monedas) {
            int valorMoneda = (int) (moneda * 100);  // Convertir la moneda a centavos
            if (parteDecimal >= valorMoneda) {
                int numMonedas = parteDecimal / valorMoneda;
                parteDecimal = parteDecimal % valorMoneda;
                System.out.println(numMonedas + " moneda(s) de " + moneda);
            }
        }


    }

    public static void punto5() {
        System.out.println("Ingrese un número entero: ");
        Integer numero = l.nextInt();
        System.out.println("Variable tipo " + numero.getClass() + numero);
        String.valueOf(numero);
        System.out.println("Variable tipo String: " + numero.getClass() + numero);
    }

    public static void punto6() {
        
        String frase = "La lluvia en Mendoza es escasa";
        
        int tamañoFrase = frase.length();
        
        System.out.println("La frase: \"La lluvia en Mendoza es escasa\", tiene " + tamañoFrase + " caracteres");
    }

    public static void punto7() {
        System.out.println("Ingrese una cadena: ");
        String cadena = l.nextLine();
        cadena = cadena.toLowerCase();
        int longitud = cadena.length();
        int contadorVocales = 0, i;

        for (i = 0; i < longitud; i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' ||
                    caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("La longitud de la cadena es de " + longitud +
                " y contiene un total de " + contadorVocales + " vocales.");
    }

    public static void punto8() {
        System.out.println("Ingrese una cadena: ");
        String cadena = l.nextLine();
        cadena =cadena.toLowerCase();
        int longitud = cadena.length();
        int i;
        for(i =0;i<longitud;i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a') {
                cadena = cadena.replace('a', 'e');
            }
        }
        System.out.println("La nueva cadena es '"+cadena +"'");
    }

   public static void punto9() {
        
        System.out.println("- CONVERSIÓN A CÓDIGO ASCII -");
        
        String frase = "La lluvia en Mendoza es escasa";
        String ASCII = "";
        String letras = "";
        
        int tamañoFrase = frase.length();
        
        for (int i = 0; i < tamañoFrase; i++) {
            
            char letra = frase.charAt(i);
            
            int codigoASCII = (int) letra;
            
            ASCII += codigoASCII + " ";
            
            if (codigoASCII < 10) {
                letras += letra + " ";  // Si el código ASCII tiene 1 dígito
            } else if (codigoASCII < 100) {
                letras += letra + "  ";   // Si el código ASCII tiene 2 dígitos
            } else {
                letras += letra + "   ";    // Si el código ASCII tiene 3 dígitos
            }
        }
 
        System.out.println("Si convertimos la frase: \"" + frase + "\" a código ASCII, nos quedaría: ");
        System.out.println();
        System.out.println(ASCII);
        System.out.println(letras);
        
    }

    public static void punto10(){
        System.out.println("Ingrese una frase: ");
        String cadena = l.nextLine();
        int opcion;
        do{
            System.out.println("Si quiere pasar su frase a mayúsculas presione 1\n" +
                    "Si quiere pasarla a minúsculas pulse 2: ");
            opcion = l.nextInt();
            switch (opcion){
                case 1:
                    cadena = cadena.toUpperCase();
                    System.out.println(cadena);
                    break;
                case 2:
                    cadena = cadena.toLowerCase();
                    System.out.println(cadena);
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }
        }while (opcion != 1 & opcion != 2);
    }

    public static void punto11(){
        l.nextLine();
        String palabra1, palabra2;
        System.out.println("Ingrese 2 palabras: ");
        palabra1 = l.nextLine();
        palabra2 = l.nextLine();
        int compareTo = palabra1.compareTo(palabra2);
        int compareToIgnoreCase = palabra1.compareToIgnoreCase(palabra2);
        boolean equals = palabra1.equals(palabra2);

        if (compareTo == 0){
            System.out.println("Para el metodo compareTo las frases son iguales.");
        }else{
            System.out.println("Para el metodo compareTo las frases no son iguales.");
        }

        if (compareToIgnoreCase == 0){
            System.out.println("Para el metodo compareToIgnoreCase las frases son iguales.");
        }else{
            System.out.println("Para el metodo compareToIgnoreCase las frases no son iguales.");
        }

        if (equals){
            System.out.println("Para el metodo compareTo las frases son iguales.");
        }else{
            System.out.println("Para el metodo compareTo las frases no son iguales.");
        }
    }

    public static void punto12(){
        String cadena = "Otorrinolaringología", nuevaCadena;
        nuevaCadena = cadena.substring(3,5);
        System.out.println(cadena);
        System.out.println(nuevaCadena);
    }

    public static void punto13(){
        String cadena1, cadena2;
        System.out.println("Ingrese dos cadenas: ");
        cadena1 = l.nextLine();
        cadena2 = l.nextLine();

        if (cadena1.contains(cadena2)){
            System.out.println("La cadena '" + cadena2 + "' si se encuentra dentro de la cadena '" + cadena1 + "'");
        }else{
            System.out.println("La cadena '" + cadena2 + "' no se encuentra dentro de la cadena '" + cadena1 + "'");
        }
    }
    
    public static void punto14 () {
        
        System.out.println(" Indique cual es la diferencia entre los datos primitivos (por valor) ejemplo el int" +
                           " y su contraparte por referencia ejemplo Integer ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("""
                           La diferencia es que los primitivos son tipos de datos y si no se les indica un valor se inicializan en 0
                           Los por referencia en valor, la contraparte de tipo objeto y si no los inicializamos por defecto son null.
                           Cualquiera de estos al no ser inicializados nos arrojan un error por consola del tipo Null Pointer Exception.
                           """);
    }
    
    public static void punto15() {
        
        System.out.println("Indique que sucede si realizo la siguiente declaración de variable: ");
        System.out.println("int numero = null --> Me salta un error por consola.");
        System.out.println("---------------------------------------------------------");
        System.out.println("¿Qué debo modificar para poder asignar null a la variable?");
        System.out.println("Debo cambiar de int a Integuer.");
    }

    public static void punto16(){
        Double doubleObj = 0.0;
        System.out.println("La variable '" + doubleObj + "' es de tipo objeto.");
        doubleObj.doubleValue();
        System.out.println("Ahora la variable '" + doubleObj + "' es de tipo primitiva.");
    }

    public static void punto17() {
        Date fehcaActual = new Date();
        String fechaFormateada = Funciones.getFechaString(fehcaActual);
        System.out.println("Fecha formateada: " + fechaFormateada);
    }

    public static void punto18(){
        int dia, mes, anio;
        System.out.println("Ingrese día: ");
        dia = l.nextInt();
        System.out.println("Ingrese mes: ");
        mes = l.nextInt();
        System.out.println("Ingrese año: ");
        anio = l.nextInt();

        Date fechaDate = Funciones.getFechaDate(dia,mes,anio);
        System.out.println("Fecha tipo Date: " + fechaDate);
    }

    public static void punto21() {
        
        int n;
        
        do { 
            System.out.println("Ingrese un n° entero mayor a 0");
            n = l.nextInt();
        } while (n <= 0);
        
        int suma = n;
        
        System.out.print(n + " + ");
        for (int i = n; i > 1; i--) {
            n--;
            suma += n;
            if (n != 1) {
                System.out.print(n + " + ");
            } else {
                System.out.print(n + " = " + suma);
            }
        }
        
        
    }

    public static void punto22() {
        
        System.out.print("Ingrese un número entero para sumar sus digitos: ");
        int num = l.nextInt();

        // Variables para la cadena y el cálculo de la suma
        int suma = 0;
        String resultado = "";

        // Construir la cadena y calcular la suma
        while (num > 0) {
            int digito = num % 10; // Obtener el último dígito
            suma += digito; // Sumar el dígito a la suma
            
            if (resultado.isEmpty()) {
                resultado = digito + "";
            } else {
                resultado = digito + " + " + resultado;
            }
            
            num /= 10; // Eliminar el último dígito
        }

        // Mostrar el resultado
        System.out.println(resultado + " = " + suma);
    }
    
    public static void punto23() {
        
        System.out.println("Ingrese un texto");
        String cadena = l.nextLine();
        
        System.out.println("El texto invertido queda: ");
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println();
    }

}


