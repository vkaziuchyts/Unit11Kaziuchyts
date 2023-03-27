package lt.lhu.unit11.main;

public class Task03Lesson11 {

	public static void main(String[] args) {
		// 16.Сформировать квадратную матрицу порядка n диагональ слева направо n*(n+1)
		int n = 8;
		int k = 2;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			mas[i][i] = k * (i + 1);
			k++;
		}

		print2dArray(mas);
	}

	public static void print2dArray(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
