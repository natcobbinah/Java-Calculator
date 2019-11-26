package gui;

public class FactorialMethod {

	private static double factorial;
	private static double combination;
	private static double combination1;
	private static double permutation;
	private static double permutation1;

	public static double getFactorial() {
		return factorial;
	}

	public static int setFactorial(double factorial) {
		FactorialMethod.factorial = factorial;

		if (factorial == 0) {
			return 1;
		}

		else {
			return (int) (factorial * setFactorial(factorial - 1));
		}

	}

	public static double getCombination() {
		return combination;
	}

	public static double setCombination(double combination, double combination1) {
		FactorialMethod.combination = combination;
		FactorialMethod.combination1 = combination1;

		double combinationvalueone = setFactorial(combination);

		double combinationvaluetwo = setFactorial(combination1);

		double upperlowerdifference = combination - combination1;

		double upperlowerdifferencefact = setFactorial(upperlowerdifference);

		double denominatormultiply = upperlowerdifferencefact * combinationvaluetwo;

		double allcombination = combinationvalueone / denominatormultiply;

		return allcombination;
	}

	public static double getPermutation() {
		return permutation;
	}

	public static double setPermutation(double permutation,double permutation1) {
		FactorialMethod.permutation = permutation;
		FactorialMethod.permutation1=permutation1;
		
		double permuationvalueone = setFactorial(permutation);
		
		double permuationdifference=permutation - permutation1;
		
		double permdifferencefact = setFactorial(permuationdifference);
		
		double allpermutation = permuationvalueone/permdifferencefact;
		
		return allpermutation;
	}

}
