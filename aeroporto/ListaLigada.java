package aeroporto;

public class ListaLigada {
	private Node head;
	private Node tail;
	private int size;

	public boolean isEmpty() {
		return this.head == null;
	}

	public void adicionaInicio(Object elemento) {
		if(this.size == 0) {
			Node newNode = new Node(elemento);
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node newNode = new Node(this.head, elemento);
			this.head.setAnterior(newNode);
			this.head = newNode;
		}
		this.size++;
	}

	public void adicionaFinal(Object elemento) {
		if(this.size == 0) {
			adicionaInicio(elemento);
		} else {
		Node newNode = new Node(elemento);
		this.tail.setProximo(newNode);
		newNode.setAnterior(this.tail);
		this.tail = newNode;
		this.size++;
		}
	}

	public boolean posOcupada(int pos) {
		return pos >= 0 && pos < this.size;
	}

	public Node pegaNode(int pos) {
		if(!posOcupada(pos)) {
			System.out.println("Posição não existe");
		}
		Node atual = this.head;

		for(int i = 0; i < pos; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

	public void adicionaPos(Object elemento, int pos) {
		if(pos == 0) {
			adicionaInicio(elemento);
		} else if(pos == this.size) {
			adicionaFinal(elemento);
		} else {
			Node anterior = this.pegaNode(pos - 1);
			Node proximo = anterior.getProximo();
			Node newNode = new Node(anterior.getProximo(), elemento);
			newNode.setAnterior(anterior);
			anterior.setProximo(newNode);
			proximo.setAnterior(newNode);
			this.size++;
		}
	}

	public void removeInicio() {
		if(!this.posOcupada(0)) {
			System.out.println("Posição não existe");
		}	
		this.head = this.head.getProximo();
		this.size--;

		if(this.size == 0) {
			this.tail = null;
		}
	}

	public void removeFinal() {
		  if (!this.posOcupada(this.size - 1)) {
		    throw new IllegalArgumentException("Posição não existe");
		  }
		  if (this.size == 1) {
		    this.removeInicio();
		  } else {
		    Node penultima = this.tail.getAnterior();
		    penultima.setProximo(null);
		    this.tail = penultima;
		    this.size--;
		  }
		}

	public void removePos(int pos) {
		if(!posOcupada(pos)) {
			System.out.println("Posição não existe");
		} 
		
		if(pos == 0) {
			this.removeInicio();
		} else if(pos == this.size) {
			this.removeFinal();
		} else {
			Node anterior = this.pegaNode(pos - 1);
			Node atual = anterior.getProximo();
			Node proximo = atual.getProximo();
			
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			this.size--;
		}
	}
	
	public boolean contem(Object elemento) {
		Node atual = this.head;
		
		while(atual != null) {
			if(atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	}

	public int quantidade() {
		return this.size;
	}
	
	public void exibir() {
		if(isEmpty()) {
			System.out.println("Lista Vazia");
		} else {
			Node aux = this.head;
			while(aux != null) {
				System.out.println(aux.getElemento().toString());
				aux = aux.getProximo();
			}
			System.out.println("Quantidade de elementos armazenados são: " + this.quantidade());
		}
	}
}
