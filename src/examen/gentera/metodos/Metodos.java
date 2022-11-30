package examen.gentera.metodos;

import java.util.Arrays;
import java.util.Collections;

public class Metodos {
	
	public void metodoUno() {
		
		Integer [] numeros = {3, -10, 5, 1, 2, 1, 7, 0, -1};
		Arrays.sort(numeros, Collections.reverseOrder());                                                                 
		for (int numero : numeros) {
		       System.out.println(numero);                                                                                     
		}
	}

}
