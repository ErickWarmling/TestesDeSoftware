package ValidarEnderecoIP;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestValidarEnderecoIP {

    private static ValidarEndereçoIP validarEndereco = null;

    @BeforeClass
    public static void criarObjeto() {
        validarEndereco = new ValidarEndereçoIP();
    }

    @Test
    public void TestValidarEndereco() {
        boolean resultado = validarEndereco.isIPValido("192.168.0.1");
        assertTrue(resultado);

        resultado = validarEndereco.isIPValido("fgv.169.1");
        assertFalse(resultado);
    }
}