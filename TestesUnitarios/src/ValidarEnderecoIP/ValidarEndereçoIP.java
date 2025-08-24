package ValidarEnderecoIP;

/*
 * O código abaixo contém um método que valida endereços IP
 */
public class ValidarEndereçoIP {
	public boolean isIPValido(String ip) {
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
			Integer.parseInt(parte);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}