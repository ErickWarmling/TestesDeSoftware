import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercicio01 {
    // Valida se a senha possui entre 8 e 16 caracteres
    public boolean validarSenha(String senha) {
        int tamanho = senha.length();
        return tamanho > 8 && tamanho < 16;
    }

    @Test
    public void testSenha8Caracteres() {
        String senha = "ErickWSC";
        boolean resultado = validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    public void testSenha9Caracteres() {
        String senha = "ErickW_SC";
        boolean resultado = validarSenha(senha);
        assertTrue(resultado);
    }

    @Test
    public void testSenha15Caracteres() {
        String senha = "TesteDeSoftware";
        boolean resultado = validarSenha(senha);
        assertTrue(resultado);
    }

    @Test
    public void testSenha16Caracteres() {
        String senha = "TestesDeSoftware";
        boolean resultado = validarSenha(senha);
        assertFalse(resultado);
    }
}