package MaiorValorVetor;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMaiorValorVetor {

    private static MaiorValorVetor maiorValorVetor = null;

    @BeforeClass
    public static void criarObjeto() {
        maiorValorVetor = new MaiorValorVetor();
    }

    @Test
    public void testMaiorValor() {
        int[] vetor = {1, 5 , 9, 33, 25, 10, 3, 30, 4, 15};
        int indiceMaiorValor = maiorValorVetor.posicaoMaiorValor(vetor);
        assertEquals(3, indiceMaiorValor);
    }
}