package mx.edu.utng.mmacias.calculadoraapp;

/**
 * Created by Dell Latitude on 25/09/2017.
 */

public class CalculadoraNormal implements Calculadora {



    public double calcularMultiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    public double calcularDivision(double num1, double num2) {
        return num1 / num2;
    }

    @Override
    public double calcularSuma(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double calcularRestar(double num1, double num2) {
        return num1-num2;
    }
}
