package gui;

public class SolverEqnexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[][] = {{0.0,1.0,5.0,-2.0},
				{7.0,-6.0,3.0,1.0},
				{1.0,4.0,2.0,-3.0},
				{5.0,-2.0,1.0,4.0}
		};
		
		double b[]= {9.0,8.0,3.0,20.0};
		
		SolvingSysofEqns.gaussJordan(a, b);
		//SolvingSysofEqns.gaussian(a, b);
		//SolvingSysofEqns.luDecomp(a, b);

		for(int i=0; i<a.length; ++i) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}

}
