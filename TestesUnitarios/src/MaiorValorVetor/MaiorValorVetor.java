package MaiorValorVetor;

/*
 * O código abaixo contém um método 
 * para retornar a posição do maior valor em um vetor
 */
public class MaiorValorVetor {
	public int posicaoMaiorValor(int[] vetor) {
		if (vetor == null || vetor.length == 0) {
			return -1;
		}
		int maiorValor = vetor[0];
		int indiceMaiorValor = 0;
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				indiceMaiorValor = i;
			}
		}
		return indiceMaiorValor;
	}
}