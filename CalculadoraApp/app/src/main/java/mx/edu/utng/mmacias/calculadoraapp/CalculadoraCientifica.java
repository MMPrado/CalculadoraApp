package mx.edu.utng.mmacias.calculadoraapp;

/**
 * Created by Dell Latitude on 25/09/2017.
 */

public class CalculadoraCientifica implements Calculadora {
    @Override
    public double calcularSuma(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double calcularRestar(double num1, double num2) {
        return num1-num2;
    }
    public int calcularFactorial(int numero) {
        if (numero ==0) {
            return 1;
        }else{
            return numero*calcularFactorial(numero-1);
        }

    }

}


