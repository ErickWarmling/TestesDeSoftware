package Media;

public class Media {

    public double calcularMedia(double[] notas) {
        double somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }
        return somaNotas / notas.length;
    }
    
    public double calcularMediaPonderada(double[] notas, double[] pesos) {
        double somaNotasPesos = 0;
        double somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotasPesos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        return somaNotasPesos / somaPesos;
    }
}