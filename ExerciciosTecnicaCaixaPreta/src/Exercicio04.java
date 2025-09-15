import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercicio04 {
    public static boolean validarCEP(String cep) {
        if (cep == null || cep.isEmpty()) {
            return false;
        }

        String cepNumeros = cep.replace("-", "");

        if (cepNumeros.length() != 8) {
            return false;
        }

        try {
            Long.parseLong(cepNumeros);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Test
    public void testCepValido() {
        String cep = "88650-000";
        boolean resultado = validarCEP(cep);
        assertTrue(resultado);
    }

    @Test
    public void testCepMenorQue8() {
        String cep = "8914000";
        boolean resultado = validarCEP(cep);
        assertFalse(resultado);
    }

    @Test
    public void testCepMaiorQue8() {
        String cep = "886501239";
        boolean resultado = validarCEP(cep);
        assertFalse(resultado);
    }

    @Test
    public void testCepComLetra() {
        String cep = "886500Ew";
        boolean resultado = validarCEP(cep);
        assertFalse(resultado);
    }

    @Test
    public void testCepComSimbolo() {
        String cep = "886500E$";
        boolean resultado = validarCEP(cep);
        assertFalse(resultado);
    }

    @Test
    public void testCepVazio() {
        String cep = "";
        boolean resultado = validarCEP(cep);
        assertFalse(resultado);
    }

    @Test
    public void testCepNulo() {
        String cep = null;
        boolean resultado = validarCEP(cep);
        assertFalse(resultado);
    }
}