package lt.lhu.unit11.main;

public class Task02Lesson11 {

	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка n диагональ справа налево 1 2 .. п-1
		// n;
		int n = 8;
		int[][] mas = new int[n][n];
		int k = 1;

		for (int i = 0; i < mas.length; i++) {
			mas[i][mas[i].length - k] = n - (mas.length - k);
			k++;
		}

		print2d(mas);
	}

	public static void print2d(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}