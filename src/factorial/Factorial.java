package factorial;

public class Factorial {

	public static int de(int n) {
		if (n < 0)
			throw new Error("No puede calcularse el factorial de un negativo");
		if (n == 0)
			return 1;
		if (n >= 3)
			return n * de(n - 1);
		return n;
	}

}
