package lista;

public class ListaCircular {

	private No inicio;
	private No ultimo;
	private int tamanho;
	
	public ListaCircular() {
		this.inicio = null;
		this.ultimo = null;
		this.tamanho = 0;
	}
	
	public void inserirElemento(int elementoNovo) {
		No novoNo = new No(elementoNovo);
		
		if (listaVazia() == true) {
			this.inicio = novoNo;
			this.ultimo = novoNo;
			novoNo.setProximo(novoNo);
			tamanho++;
			return;
		}
		
		if (novoNo.getElemento() < this.inicio.getElemento()) {
			novoNo.setProximo(this.inicio);
			this.inicio = novoNo;
			this.ultimo.setProximo(novoNo);
			tamanho++;
			return;
		}
		
		if (novoNo.getElemento() > ultimo.getElemento()) {
			this.ultimo.setProximo(novoNo);
			novoNo.setProximo(this.inicio);
			this.ultimo = novoNo;
			tamanho++;
			return;
		}
		
		// condicao padrao
		for (No atual = this.inicio; atual.getProximo() != this.inicio; atual = atual.getProximo()) {
			int elementoAtual = atual.getElemento();
			int elementoProximo = atual.getProximo().getElemento();
			
			if (novoNo.getElemento() > elementoAtual && novoNo.getElemento() <= elementoProximo) {
				novoNo.setProximo(atual.getProximo());
				atual.setProximo(novoNo);
				tamanho++;
				return;
			}
		}	
	}
	
	
	public void removerElemento(int elementoRemovido) {
		No atual = this.ultimo;		
		boolean existeNaLista = false; 
		
		for (int i = 0; i<this.tamanho; i++) {
			int elementoComparado = atual.getProximo().getElemento();
			
			if (elementoRemovido == elementoComparado) {
				atual.setProximo(atual.getProximo().getProximo());
				tamanho--;
				
				if (elementoRemovido == this.inicio.getElemento()) {
					this.inicio = this.inicio.getProximo();
				} else if (elementoRemovido == this.ultimo.getElemento()) {
					this.ultimo = this.ultimo.getProximo(); // deve ta aqui o erro
				}
				
				existeNaLista = true;
				
			} else {
				atual = atual.getProximo();
			}
		}		
		
		if (existeNaLista == false) { 
			System.out.println("Elemento '" +elementoRemovido+ "' nao existe na lista!");
		}
		
		// ta aqui
		if (this.tamanho == 0) {
			this.inicio = null;
		}
	}
	
	
	public int getTamanho() {
		return tamanho;
	}

	
	public boolean listaVazia() {
		if (this.inicio == null) {
			return true;
		}
		return false;
	}
	
	public String imprimirLista() {
		StringBuilder builder = new StringBuilder();
		No atual = this.inicio;
		builder.append("[");
		
		if (atual != null) {
			for(atual = this.inicio; atual.getProximo() != this.inicio;) {
				builder.append(atual.getElemento()).append(", ");
				atual = atual.getProximo();
			}
			builder.append(atual.getElemento());
		}
				
		builder.append("]");
		return builder.toString();
	}
	
	public void testeRemover(int elementoRemovido) {
		No atual = this.ultimo;		
		boolean existeNaLista = false; 
		
		// there it is
		do {
			System.out.println(atual.getProximo().getElemento());
			atual = atual.getProximo();
		} while (atual != this.ultimo);
		
		/*
		for (atual = this.ultimo; atual.getProximo() != this.ultimo;) {
			int elementoComparado = atual.getProximo().getElemento();
			
			if (elementoComparado == elementoRemovido) {
				System.out.println("chamou aqui");
			}
			atual = atual.getProximo();
		}
		*/
	}
	
}
