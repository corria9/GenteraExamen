import examen.gentera.metodos.Metodos;

//Crear Clase Principal con mi nombre JuanArmandoCoriaFierros
public class JuanArmandoCoriaFierros {
	
	Metodos metodos;

	public JuanArmandoCoriaFierros() {
		
		metodos = new Metodos();
		
		
		//Llamando al Primer Metodo
		System.out.println("######  METODO UNO  ######" );
		metodos.metodoUno();
		
		
		//Llamando al Segundo Metodo
		System.out.println();
		System.out.println("######  METODO DOS  ######" );
		System.out.println(metodos.metodoDos("oro"));
		
		
		//Llamando al Tercer Metodo
		System.out.println();
		System.out.println("######  METODO TRES  ######" );
		metodos.metodoTres();
		
		
		//Llamando al Cuarto Metodo
		System.out.println();
		System.out.println("######  METODO CUATRO  ######" );
		metodos.metodoCuatro(6);
	}
	
	public static void main(String[] args) {
		new JuanArmandoCoriaFierros();

	}

}
