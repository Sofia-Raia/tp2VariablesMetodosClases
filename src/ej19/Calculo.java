package ej19;
public class Calculo {
    public static void main() {
        // Crear una instancia de OperacionMatematica con valores iniciales
        OperacionMatematica op = new OperacionMatematica(10.5, 5.5);
        
        System.out.println("OPERACIONES CON LOS NUMEROS 10.5 Y 5.5: ");

        // Ejecutar y mostrar los resultados de las operaciones
        System.out.println("Suma: " + op.aplicarOperacion("+"));
        System.out.println("Resta: " + op.aplicarOperacion("-"));
        System.out.println("Multiplicación: " + op.aplicarOperacion("*"));
        System.out.println("División: " + op.aplicarOperacion("/"));
    }
}
