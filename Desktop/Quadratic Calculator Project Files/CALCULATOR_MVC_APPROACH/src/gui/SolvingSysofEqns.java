package gui;

public class SolvingSysofEqns {

	public static void gaussJordan(double a[][], double b[]) {

		int i, j, k, m;
		double temp;

		int numRows = a.length;
		int numCols = a[0].length;
		int index[][] = new int[numRows][2];

		// Perform an implicit partial pivoting of the
		// a[][] array and b[] array

		partialPivot(a, b, index);

		// Perform the elimination row by row. First dividing
		// the current row and b element by a[i][j]

		for (i = 0; i < numRows; ++i) {
			temp = a[i][i];
			for (j = 0; j < numCols; ++j) {
				a[i][j] /= temp;
			}
			b[i] /= temp;
			a[i][i] = 1.0 / temp;

			// Reduce the other rows by subtracting a multiple
			// of the current row from them. Don't reduce the
			// current row. As each column of the a[][] matrix
			// is reduced its element are replaced with the
			// inverse a[][] matrix

			for (k = 0; k < numRows; ++k) {
				if (k != i) {
					temp = a[k][i];
					for (j = 0; j < numCols; ++j) {
						a[k][j] -= temp * a[i][j];
					}
					b[k] -= temp * b[i];
					a[k][i] = -temp * a[i][i];
				}
			}
		}

		// Unscramble the inverse a[][] matrix
		// The columns are swapped in the opposite order
		// that the rows were during the pivoting

		for (j = numCols - 1; j >= 0; --j) {
			k = index[j][0];
			m = index[j][1];
			if (k != m) {
				for (i = 0; i < numRows; ++i) {
					temp = a[i][m];
					a[i][m] = a[i][k];
					a[i][k] = temp;
				}
			}
		}
		return;
	}

	public static void gaussian(double a[][], double b[]) {

		int numRows = a.length;
		int numCols = a[0].length;
		int index[][] = new int[numRows][2];

		// Perform an implicit partial pivoting of the
		// a[][] array and b[] array

		partialPivot(a, b, index);

		// Turn the a[][] into an upper-diagonal by
		// subtracting a multiple of the current row
		// from those below it. Do the same to eh
		// b[] array

		for (int i = 0; i < numRows; ++i) {
			b[i] /= a[i][i];
			for (int j = numCols - 1; j >= i; --j) {
				a[i][j] /= a[i][i];
			}

			for (int k = i + 1; k < numRows; ++k) {
				b[k] -= a[k][i] * b[i];
				for (int m = i + 1; m < numCols; ++m) {
					a[k][m] -= a[k][i] * a[i][m];
				}
			}
		}

		// Solve for b[] array with back substitution
		// The diagonal elements of the a[][] matrix
		// were previously normalized to 1.

		for (int i = numRows - 2; i >= 0; --i) {
			for (int j = i + 1; j < numRows; ++j) {
				b[i] -= a[i][j] * b[j];
			}
		}
		return;
	}

	public static void luDecomp(double a[][], double b[]) {
 
		double temp;
		int i,j,k,m;
		double tempRow[];
		
		int numRows = a.length;
		int numCols = a[0].length;
		
		//The a[][] matrix is overwritten into one that
		//holds the lower and upper diagonal matrices
		
		for(j= 0; j<numCols; ++j) {
			
			//Upper diagonal elements
			
			for(i=0; i<=j; ++i) {
				for(k=0;k<j; ++k) {
					a[i][j] -= a[i][k]*a[k][j];
				}
				
				//Determine the pivot element for the current
				//column and rearrange the rows accordingly
				
				m=j;
				for(i=j+1; i<numRows; ++i) {
					if(Math.abs(a[i][j]) > Math.abs(a[m][j])) {
						m=i;
					}
				}
				if(m != j) {
					tempRow = a[j];
					a[j]=a[m];
					a[m]=tempRow;
					temp = b[j];
					b[j] = b[m];
					b[m]=temp;
				}
				
				//Divide lower diagonal elements by diagonal value
				for(i=j+1; i<numRows; ++i) {
					a[i][j] /=a[j][j];
				}
			}//end of LU matrix load
			
			//Use forward and backward substitution to solve for 
			//the unknowns. First the forward substitution.
			
			for(i=1; i<numRows; ++i) {
				for(j=0; j<i; ++j) {
					b[i] -= a[i][j]*b[j];
				}
			}
			
			//And then the backward substitution
			b[numRows-1] = b[numRows-1]/a[numRows-1][numRows-1];
			for(i=numRows-2; i>=0; --i) {
				for(j= i+1; j<numCols; ++j) {
					b[i] -= a[i][j]*b[j];
				}
				b[i] /= a[i][i];
			}
			return;
		}
	}

	public static void invertMatrix(double a[][]) {

		int i,j,k,m;
		double temp;
		
		int numRows = a.length;
		int numCols = a[0].length;
		int index[][]= new int[numRows][2];
		
		//Perform an implicit partial pivoting of the
		///a[][] array. We will provide a dummy b array
		//to the partialPivo() method
		
		partialPivot(a,new double[numRows], index);
		
		//Perform the elimination row by row. First dividing
		//thhe current row by a[i][i]
		
		for(i=0; i<numRows; ++i) {
			temp = a[i][i];
			for(j=0;  j<numCols; ++j) {
				a[i][j] /= temp;
			}
			a[i][i] = 1.0/temp;
			
			//Reduce the error rows by subtracting a multiple 
			//of the current row from them. Don't reduce the 
			//current row. As each column of the a[][] matrix
			//is reduced its elements are replaced with the 
			//inverse a[][] matrix
			
			for(k=0; k<numRows; ++k) {
				if(k != 1) {
					temp = a[k][i];
					for(j=0; j<numCols; ++j) {
						a[k][j] -= temp*a[i][j];
					}
					a[k][i] = -temp*a[i][i];
				}
			}
		}
		
		//Unscramble the inverse a[][] matrix.
		//The columns are swapped in the opposite order
		//that the rows were during the pivoting
		
		for(j=numCols-1; j>=0; --j) {
			k=index[j][0];
			m = index[j][1];
			if(k != m) {
				for(i=0; i<numRows; ++i) {
					temp= a[i][m];
					a[i][m] = a[i][k];
					a[i][k] = temp;
				}
			}
		}
	}

	private static void partialPivot(double a[][], double b[], int index[][]) {

		double temp;
		double tempRow[];
		int i, j, m;
		int numRows = a.length;
		int numCols = a[0].length;
		double scale[] = new double[numRows];

		// Determine the scale factor(the largest element)
		// for reach row to use with implicit pivoting.
		// Initialize the index[][] array for an unmodified
		// array

		for (i = 0; i < numRows; ++i) {
			index[i][0] = i;
			index[i][1] = i;
			for (j = 0; j < numCols; ++j) {
				scale[i] = Math.max(scale[i], Math.abs(a[i][j]));
			}
		}

		// Determine the pivot element for each column and
		// rearrange the rows accordingly. The m variable
		// stores the row number that has the maximum
		// scaled value below the diagonal for each column
		// THe index[][] array stores the history of the row
		// swaps and is used by the Gauss-Jordan method to
		// unscramble the inverse a[][] matrix

		for (j = 0; j < numCols - 1; ++j) {
			m = j;
			for (i = j + 1; i < numRows; ++i) {
				if (Math.abs(a[i][j]) / scale[i] > Math.abs(a[m][j]) / scale[m]) {
					m = i;
				}
			}
			if (m != j) {
				index[j][0] = j;
				index[j][1] = m;

				tempRow = a[j];
				a[j] = a[m];
				a[m] = tempRow;

				temp = b[j];
				b[j] = b[m];
				b[m] = temp;

				temp = scale[j];
				scale[j] = scale[m];
				scale[m] = temp;
			}
		}
		return;
	}

}
