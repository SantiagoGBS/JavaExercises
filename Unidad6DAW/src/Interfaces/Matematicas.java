package Interfaces;

import java.util.Arrays;

public class Matematicas implements MathArray {

	@Override
	public int min(int[] array) {
		Arrays.sort(array);
		return array[0];
	}

	@Override
	public int max(int[] array) {
		Arrays.sort(array);
		return array[array.length - 1];
	}

	@Override
	public int sum(int[] array) {

		return 0;
	}

	@Override
	public float min(float[] array) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float max(float[] array) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float sum(float[] array) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] arg) {
		Matematicas m = new Matematicas();
		int[] array = { 11, 5, 8, 3, 2, 98 };
		System.out.println(Arrays.toString(array));
		System.out.println("Minimo: " + m.min(array));
		System.out.println("Maximo: " + m.max(array));
		System.out.println("Suma: " + m.sum(array));
	}
}
