import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercicio02 {
    // Valida se a senha possui entre 8 e 16 caracteres e possui apenas letras
    public boolean validarSenha(String senha) {
        int tamanho = senha.length();
        if (tamanho < 8 || tamanho > 16) {
            return false;
        }
        for (char c : senha.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

    @Test
    public void testSenhaMenorQue8() {
        String senha = "abcdefg";
        boolean resultado = validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    public void testSenhaLimiteInferiorValido() {
        String senha = "abcdefgh";
        boolean resultado = validarSenha(senha);
        assertTrue(resultado);
    }

    @Test
    public void testSenhaLimiteSuperiorValido() {
        String senha = "abcdefghijklmop";
        boolean resultado = validarSenha(senha);
        assertTrue(resultado);
    }

    @Test
    public void testSenhaMaiorQue16() {
        String senha = "abcdefghijklmnopq";
        boolean resultado = validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    public void testSenhaComCaractereInvalido() {
        String senha = "abcd1234";
        boolean resultado = validarSenha(senha);
        assertFalse(resultado);
    }
}