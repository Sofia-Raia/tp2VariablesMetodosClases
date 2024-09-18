package ej19;
public class Calculo {
    public static void main(String[] args) {
        // Crear una instancia de OperacionMatematica con valores iniciales
        OperacionMatematica op = new OperacionMatematica(10.5, 5.5);

        // Ejecutar y mostrar los resultados de las operaciones
        System.out.println("Suma: " + op.aplicarOperacion("+"));
        System.out.println("Resta: " + op.aplicarOperacion("-"));
        System.out.println("Multiplicación: " + op.aplicarOperacion("*"));
        System.out.println("División: " + op.aplicarOperacion("/"));
    }
}
