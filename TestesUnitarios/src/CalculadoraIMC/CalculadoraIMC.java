package CalculadoraIMC;

/*
 * O código abaixo contém um método para calcular 
 * e retornar a faixa de peso pelo IMC.
 */
public class CalculadoraIMC {
    public String calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}