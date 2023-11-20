package EjercicioPilasD;

public class PilaDinamica {
	Nodo cima;
	
	public void push (Caramelo caramelo) {
		Nodo nuevo = new Nodo(caramelo);
		nuevo.siguiente = cima;
		cima = nuevo;
	}
	
	public Caramelo pop() {
		if (cima == null) {
			return null;
		}
		Caramelo caramelo = cima.caramelo;
		cima = cima.siguiente;
		return caramelo;
	}

}
