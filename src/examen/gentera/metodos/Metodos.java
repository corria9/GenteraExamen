package examen.gentera.metodos;

import java.util.Arrays;
import java.util.Collections;

public class Metodos {

	
	
	// Método 1: Ordenar un arreglo numérico de mayor a menor

	public void metodoUno() {

		Integer[] numeros = { 3, -10, 5, 1, 2, 1, 7, 0, -1 };
		Arrays.sort(numeros, Collections.reverseOrder());
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}

	
	
	// Método 2. Detectar si un arreglo contiene un palíndromo y cuantos contiene.

	
	public boolean metodoDos(String palabra) {

		palabra = palabra.toLowerCase();

		for (int i = 0, j = palabra.length() - 1; i <= j; i++, j--) {
			if (palabra.charAt(i) != palabra.charAt(j)) {
				System.out.println("Tu palabra " + palabra + " NO ES palindromo!");
				return false;
			}
		}
		System.out.println("Tu palabra " + palabra + " ES palindromo!");
		return true;
	}
	
	
	
	
	// Método 3. Método que reciba un arreglo numérico y que indique si está ordenado descendente ascendente o está en desorden.

	
	public void metodoTres() {

		int[] arreglo1 = { 5, 6, 7, 74 };
		int[] arreglo2 = { 7, 6, 5, 4 };
		int[] arreglo3 = { 5, 7, 6, 74 };
		int[] arreglo4 = { 5, 6, 7, 8 };

		ordenado(arreglo1);
		ordenado(arreglo2);
		ordenado(arreglo3);
		ordenado(arreglo4);
	}

	static void ordenado(int[] arreglo) {
		if (ordenadoAscendente(arreglo)) {
			System.out.println("Arreglo Con Orden Ascendente");
		} else if (ordenadoDescendente(arreglo)) {
			System.out.println("Arreglo con Orden Descendente");
		} else {
			System.out.println("Arreglo Desordenado");
		}
	}

	static boolean ordenadoAscendente(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if ((array[i] + 1) != array[i + 1])
				return false;
		}
		return true;
	}

	static boolean ordenadoDescendente(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if ((array[i] - 1) != array[i + 1])
				return false;
		}
		return true;
	}
	

}
