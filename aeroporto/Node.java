package aeroporto;

public class Node {
	private Object elemento;
	private Node proximo;
	private Node anterior;
	
	public Node(Object elemento) {
		this.elemento = elemento;
	}
	
	public Node(Node proximo, Object elemento) {
		this.elemento = elemento;
		this.proximo = proximo;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}
}
