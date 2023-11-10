package not_used_for_now;

public class TrigMethods {

	private static final double LN10 = Math.log(10.0);

	public static double sinh(double a) {
		return 0.5 * (Math.exp(a) - Math.exp(-a));
	}

	public static double cosh(double a) {
		return 0.5 * (Math.exp(a) + Math.exp(-a));
	}

	public static double tanh(double a) {
		double e1 = Math.exp(a);
		double e2 = Math.exp(-a);

		return (e1 - e2) / (e1 + e2);
	}

	public static double log10(double a) {
		return Math.log(a) / LN10;
	}

	public static double getPH(double concH) {
		concH = Math.max(concH, 1.0e-30);

		return -Math.log10(concH);
	}

	public static double sininverse(double a) {
		return Math.toDegrees(Math.asin(a));
	}

	public static double cosinverse(double a) {
		return Math.toDegrees(Math.acos(a));
	}

	public static double taninverse(double a) {
		return Math.toDegrees(Math.atan(a));
	}

	public static double ln(double l) {
		return Math.log(l);
	}
}
