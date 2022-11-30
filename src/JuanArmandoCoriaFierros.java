import examen.gentera.metodos.Metodos;

//Crear Clase Principal con mi nombre JuanArmandoCoriaFierros
public class JuanArmandoCoriaFierros {
	
	Metodos metodos;

	public JuanArmandoCoriaFierros() {
		
		metodos = new Metodos();
		
		//Llamando al Primer Metodo
		metodos.metodoUno();
		
		//Llamando al Segundo Metodo
		System.out.println(metodos.metodoDos("oro"));
		
		//Llamando al Tercer Metodo
		metodos.metodoTres();
		
	}
	
	public static void main(String[] args) {
		new JuanArmandoCoriaFierros();

	}

}
