import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercicio05 {
    public static boolean isIPValido(String ip) {
        String[] partes = ip.split("\\.");
        for (String parte : partes) {
            if (!isNumeroValido(parte)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNumeroValido(String parte) {
        if (parte.isEmpty()) {
            return false;
        }
        try {
            int numero = Integer.parseInt(parte);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Test
    public void testIPValido() {
        String ip = "192.168.0.1";
        boolean resultado = isIPValido(ip);
        assertTrue(resultado);
    }

    @Test
    public void testIPParteVazia() {
        String ip = "192..0.1";
        boolean resultado = isIPValido(ip);
        assertFalse(resultado);
    }

    @Test
    public void testIPComMenosQue4Partes() {
        String ip = "192.168.%.1";
        boolean resultado = isIPValido(ip);
        assertFalse(resultado);
    }

    @Test
    public void testIPVazio() {
        String ip = "";
        boolean resultado = isIPValido(ip);
        assertFalse(resultado);
    }
}