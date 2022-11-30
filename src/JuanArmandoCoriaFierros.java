import examen.gentera.metodos.Metodos;

//Crear Clase Principal con mi nombre JuanArmandoCoriaFierros
public class JuanArmandoCoriaFierros {
	
	Metodos metodos;

	public JuanArmandoCoriaFierros() {
		
		metodos = new Metodos();
		metodos.metodoUno();
		System.out.println(metodos.metodoDos("olo"));
	}
	
	public static void main(String[] args) {
		new JuanArmandoCoriaFierros();

	}

}
