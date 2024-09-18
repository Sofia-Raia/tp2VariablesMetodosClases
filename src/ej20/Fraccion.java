package ej20;
public class Fraccion {

    public int numerador;
    public int denominador;

    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion(int numerador, int denominador) {
        //Verificar que el denominador no sea cero
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }


    //metodo para mostrar la fraccion como cadena
    public String toString(){
        return numerador + "/" + denominador;
    }

    //Función para calcular el MCD (Máximo Común Divisor) usando el algoritmo de Euclides
    private static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //metodo para simplificar la fracion
    public void simplificar() {
        int mcd = mcd(this.numerador, this.denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
    }
/////////////////////////////////////Operaciones matemáticas///////////////////////////////////////////////////
    //suma
    public static Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {

        // Calcular el nuevo numerador y denominador
        int nuevoNumerador = (f1.numerador * f2.denominador) + (f2.numerador * f1.denominador);
        int nuevoDenominador = f1.denominador * f2.denominador;

        // Crear un nuevo objeto Fraccion con el resultado
        Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);

        // Simplificar la fracción resultante
        resultado.simplificar();

        return resultado;
    }

    //resta
    public static Fraccion restarFracciones(Fraccion f1, Fraccion f2) {
        // Calcular el nuevo numerador y denominador
        int nuevoNumerador = (f1.numerador * f2.denominador) - (f2.numerador * f1.denominador);
        int nuevoDenominador = f1.denominador * f2.denominador;

        // Crear un nuevo objeto Fraccion con el resultado
        Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);

        // Simplificar la fracción resultante
        resultado.simplificar();

        return resultado;
    }

    //multiplicar
    public static Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2) {
        // Multiplicar los numeradores y denominadores
        int nuevoNumerador = f1.numerador * f2.numerador;
        int nuevoDenominador = f1.denominador * f2.denominador;

        // Crear un nuevo objeto Fraccion con el resultado
        Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);

        // Simplificar la fracción resultante
        resultado.simplificar();

        return resultado;
    }

    //dividir
    public static Fraccion dividirFracciones(Fraccion f1, Fraccion f2) {
        // Multiplicar la primera fracción por la inversa de la segunda
        int nuevoNumerador = f1.numerador * f2.denominador;
        int nuevoDenominador = f1.denominador * f2.numerador;

        // Verificar que no estamos dividiendo por cero
        if (nuevoDenominador == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }

        // Crear un nuevo objeto Fraccion con el resultado
        Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);

        // Simplificar la fracción resultante
        resultado.simplificar();

        return resultado;
    }
}



