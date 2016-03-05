package new_proj;

import java.util.ArrayList;
import java.util.List;

public class new_class {
	int[] array;

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			System.out.print(array[i] + " ");
		}

		// print max value and index in array
		System.out.println(
				"\nMax value " + Max_Min_Array(array).get(0) + "\nMax value index " + Max_Min_Array(array).get(1));
		// print min value and index in array
		System.out.println("\nMin value " + Max_Min_Array(array).get(2) + "\nMin value index "
				+ Max_Min_Array(array).get(3) + "\n");

		int[][] matrix = new int[3][5];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 1000);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Max value in rows");
		for (int i = 0; i < Matrix(matrix).size() - 2; i += 2) {
			System.out.print(Matrix(matrix).get(i) + " ");
		}
		System.out.println("\n\nMin value in rows");
		for (int i = 1; i < Matrix(matrix).size() - 2; i += 2) {
			System.out.print(Matrix(matrix).get(i) + " ");
		}
		System.out.println("\n\nMax value in matrix\n" + Matrix(matrix).get(Matrix(matrix).size() - 2));
		System.out.println("\n\nMin value in matrix\n" + Matrix(matrix).get(Matrix(matrix).size() - 1) + "\n");

		/*
		 * for (int i = 0; i < matrix.length; i++) { for(int j = 0; j <
		 * matrix[i].length; j++) { System.out.print(Change(matrix)[i][j]
		 * +"\t"); } System.out.println(); }
		 */
		int minij, maxij, c, i1 = 0, i2 = 0, j1 = 0, j2 = 0;
		minij = matrix[0][0];
		maxij = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (minij < matrix[i][j]) {
					minij = matrix[i][j];
					i1 = i;
					j1 = j;
				}
				if (maxij > matrix[i][j]) {
					maxij = matrix[i][j];
					i2 = i;
					j2 = j;
				}
			}
		}
		c = matrix[i1][j1];
		matrix[i1][j1] = matrix[i2][j2];
		matrix[i2][j2] = c;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		// 60 + (int)(Math.random()*1000);
	}

	public static List<Integer> Max_Min_Array(int[] array) {
		List<Integer> values = new ArrayList<Integer>();
		int max, i, maxi = 0, min, mini = 0;
		max = array[0];
		min = array[0];
		for (i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				maxi = i;
			}
			if (array[i] < min) {
				min = array[i];
				mini = i;
			}
		}
		values.add(max);
		values.add(maxi);
		values.add(min);
		values.add(mini);
		return values;
	}

	public static List<Integer> Matrix(int[][] matrix) {
		int min, max, minij, maxij;
		List<Integer> list = new ArrayList<Integer>();
		minij = matrix[0][0];
		maxij = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			min = matrix[i][0];
			max = matrix[i][0];
			for (int j = 0; j < matrix[i].length; j++) {
				if (min < matrix[i][j]) {
					min = matrix[i][j];
				}
				if (max > matrix[i][j]) {
					max = matrix[i][j];
				}
				if (minij < matrix[i][j]) {
					minij = matrix[i][j];
				}
				if (maxij > matrix[i][j]) {
					maxij = matrix[i][j];
				}
			}
			list.add(min);
			list.add(max);
		}
		list.add(minij);
		list.add(maxij);
		return list;
	}
	/*
	 * public static int[][] Change(int [][] matrix) { int
	 * minij,maxij,c,i1=0,i2=0,j1=0,j2=0; minij = matrix[0][0]; maxij =
	 * matrix[0][0]; for (int i = 0; i < matrix.length; i++) { for(int j = 0; j
	 * < matrix[i].length; j++) { if(minij < matrix[i][j]) { minij =
	 * matrix[i][j]; i1 = i; j1 = j; } if(maxij > matrix[i][j]) { maxij =
	 * matrix[i][j]; i2 = i; j2 = j; } } } c = matrix[i1][j1]; matrix[i1][j1] =
	 * matrix[i2][j2]; matrix[i2][j2] = c; return matrix; }
	 */
}
