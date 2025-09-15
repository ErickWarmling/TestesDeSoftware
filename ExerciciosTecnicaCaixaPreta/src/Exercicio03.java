import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercicio03 {
    // Valida se a senha possui entre 8 e 16 caracteres, possui apenas letras
    // e  a primeira letra é maiúscula
    public static boolean validarSenha(String senha) {
        int tamanho = senha.length();
        if (tamanho < 8 || tamanho > 16) {
            return false;
        }
        if (!Character.isUpperCase(senha.charAt(0))) {
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
    public void testSenhaLimiteInferiorValido() {
        String senha = "Abcdefgh";
        boolean resultado = validarSenha(senha);
        assertTrue(resultado);
    }

    @Test
    public void testSenhaLimiteSuperiorValido() {
        String senha = "Abcdefghijklmnop";
        boolean resultado = validarSenha(senha);
        assertTrue(resultado);
    }

    @Test
    public void testSenhaMaiusculoMinusculoValido() {
        String senha = "AbCdEfGh";
        boolean resultado = validarSenha(senha);
        assertTrue(resultado);
    }

    @Test
    public void testSenhaMenorQue8() {
        String senha = "Abcdefg";
        boolean resultado = validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    public void testSenhaMaiorQue16() {
        String senha = "ProgramacaoJavaUdesc";
        boolean resultado = validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    public void testSenhaLetraENumero() {
        String senha = "Erick123";
        boolean resultado = validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    public void testSenhaPrimeiraMinuscula() {
        String senha = "erickwarmling";
        boolean resultado = validarSenha(senha);
        assertFalse(resultado);
    }
}