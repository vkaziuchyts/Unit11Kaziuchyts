package lt.lhu.unit11.main;

import java.util.Random;

public class Task01Lesson11 {

	public static void main(String[] args) {
		// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали;
		int[][] array2d = populate2d(new int[8][8]);
				
		print2d(array2d);
		
		printDiagonal(array2d);

	}

	public static int[][] populate2d(int[][] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}
		return mas;
	}

	public static void print2d(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printDiagonal(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.printf("[%4d]", mas[i][i]);
				} else {
					System.out.print("      ");
				}
			}
			System.out.println();
		}
	}
}
