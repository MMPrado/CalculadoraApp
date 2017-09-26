package mx.edu.utng.mmacias.calculadoraapp;

/**
 * Created by Dell Latitude on 25/09/2017.
 */

public class Contexto {
    private  Calculadora mvc;
    public Contexto(Calculadora mvc){
        this.mvc=mvc;
    }

    public double calcularSuma(double num1, double num2){
        return mvc.calcularSuma(num1,num2);
    }
    public double calcularResta(double num1, double num2){
        return mvc.calcularRestar(num1,num2);
    }
}

