package not_used_for_now;

public class GammaMethod {
	static double grp1;
	static double grp2;
	static double grp3;

	private static double c[] = { 1.000000000190015, 76.18009172947146, -86.50532032941677, 24.01409824083091,
			-1.231739572450155, 0.1208650973866179, -0.539523938495e-5 };

	private static final double TWOPI = Math.sqrt(2.0 * Math.PI);

	static int j;

	public static double gamma(double z) {

		grp1 = z + 0.5;
		grp2 = z + 5.5;

		grp3 = c[0];

		for (j = 1; j < 7; ++j) {
			grp3 += c[j] / (z + j);
		}

		return Math.pow(grp2, grp1) * Math.exp(-grp2) * TWOPI * grp3 / z;
	}

}
