package ej19;

public class OperacionMatematica {

    double valor1;
    double valor2;
    String operacion;

    public OperacionMatematica() {
    }

    public OperacionMatematica(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;

    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String nombreOperacion) {
        this.operacion = operacion;
    }

    //////////////
    private double sumarNumeros() {
        return valor1 + valor2;
    }

    private double restarNumeros() {
        return valor1 - valor2;
    }

    private double multiplicarNumeros() {
        return valor1 * valor2;
    }

    private double dividirNumeros() {
        return valor1 / valor2;
    }


    public double aplicarOperacion(String operacion) {
        switch (operacion) {
            case "+":
                return sumarNumeros();
            case "-":
                return restarNumeros();
            case "*":
                return multiplicarNumeros();
            case "/":
                // Validación para evitar la división por cero
                if (valor2 != 0) {
                    return dividirNumeros();
                } else {
                    System.out.println("Error: División por cero");
                    return Double.NaN; // Retorna NaN si la división es por 0
                }
            default:
                System.out.println("Operación no válida");
                return Double.NaN; // Retorna NaN si la operación no es válida
        }
    }
}

