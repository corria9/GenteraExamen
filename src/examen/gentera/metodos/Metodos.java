package examen.gentera.metodos;

import java.util.Arrays;
import java.util.Collections;

public class Metodos {
	
	//M�todo 1: Ordenar un arreglo num�rico de mayor a menor
	
	public void metodoUno() {
		
		Integer [] numeros = {3, -10, 5, 1, 2, 1, 7, 0, -1};
		Arrays.sort(numeros, Collections.reverseOrder());                                                                 
		for (int numero : numeros) {
		       System.out.println(numero);                                                                                     
		}
	}
	
	//M�todo 2. Detectar si un arreglo contiene un pal�ndromo y cuantos contiene.
	
	public boolean metodoDos(String palabra) {
		
		palabra = palabra.toLowerCase();
		
		for(int i = 0, j = palabra.length() - 1; i <= j; i++, j--) {
			if (palabra.charAt(i) != palabra.charAt(j)) {
				System.out.println("Tu palabra " + palabra +" NO ES palindromo!");
				return false;
			}
		}
		System.out.println("Tu palabra " + palabra +" ES palindromo!");
		return true;
	}

}
