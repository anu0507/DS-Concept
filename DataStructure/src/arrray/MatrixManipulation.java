package arrray;

/*
 * Q1. write a program of matrix addition.
 * Q2. Write a program of matrix multiplication.
 * Q3. Write a program of matrix subtraction.
 *Given  int[][]= {
 * 			{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}								
 * 			}
 * Q4. print the elements in snake pattern ----> 4,3,2,1..5,6,7,8...12,11,10,9....13,14,15,16
 * Q5. print all the elements 1->16.
 * Q6. print elements using boundary traversal.---->1,2,3,4,8,12,16,15,14,11,3,9,5
 * Q7. print all the elements in spiral form.------>1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 
 */
public class MatrixManipulation {
	public static void snake(int[][] x) {
		for (int i = 0; i < x[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = x[0].length - 1; j >= 0; j--) {
					System.out.print(x[i][j] + " ");

				}
			} else {
				for (int j = 0; j < x[0].length; j++) {
					System.out.print(x[i][j] + " ");
				}
			}
			System.out.println();

		}

	}

	public static void printAllNumber(int[][] x) {
		for (int i = 0; i < x[0].length; i++) {
			for (int j = 0; j <= x[0].length - 1; j++) {
				System.out.print(x[i][j] + " ");
			}
		}
		System.out.println();

	}

	public static void PrintBoundaryElement(int[][] inputs) {
		if (inputs.length == 1) {
			for (int col = 0; col < inputs.length; col++) {
				System.out.print(inputs[0][col] + " ");
			}
		} else if (inputs[0].length == 1) {
			for (int row = 0; row < inputs.length; row++) {
				System.out.print(inputs[row][0] + " ");
			}

		} else {
			for (int i = 0; i < inputs.length; i++) {
				System.out.print(inputs[0][i] + " ");
			}
			for (int i = 1; i < inputs.length; i++) {
				System.out.print(inputs[i][inputs.length - 1] + " ");
			}
			for (int i = inputs.length - 2; i >= 0; i++) {
				System.out.print(inputs[inputs.length - 1][i] + " ");
			}
			for (int i = inputs.length - 2; i > 0; i--) {
				System.out.print(inputs[i][0] + " ");
			}
		}

	}

	public static void main(String[] args) {
		/*
		 * //Q1,Q2,Q3. int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } }; 
		 * int b[][] = { { 2, 2, 2 }, { 3, 3, 3 }, { 1, 1, 1 } };
		 *  int c[][] = new int[3][3]; 
		 *  for(int i = 0; i < 3; i++) {
		 *   for (int j = 0; j < 3; j++) { 
		 *   //c[i][j] = a[i][j] +b[i][j]; 
		 *   //c[i][j] = a[i][j]-b[i][j]; 
		 *   c[i][j] = a[i][j]*b[i][j];
		 * System.out.print(c[i][j]+" "); } System.out.println(); }
		 */
		 int[][] x = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
		 15, 16 } };
		// MatrixManipulation.snake(x);
		 MatrixManipulation.printAllNumber(x);
		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		//PrintBoundaryElement(array);
	}

}
