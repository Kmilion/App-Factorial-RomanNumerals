package romanos;

public class Romanos {

	public static String convertir(int n) {
		
		if (n<0)
			throw new Error("Negativos no");

		int[] arabigo = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romano = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		for (int i = 0; i < romano.length; i++) {
			if (n >= arabigo[i])
				return romano[i] + convertir(n - arabigo[i]);
		}
		return "";
	}

}
