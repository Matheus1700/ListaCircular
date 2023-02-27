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
		
		if (novoNo.getElemento() < inicio.getElemento()) {
			novoNo.setProximo(inicio);
			this.inicio = novoNo;
			tamanho++;
			return;
		}
		
		if (novoNo.getElemento() > ultimo.getElemento()) {
			ultimo.setProximo(novoNo);
			this.ultimo = novoNo;
			novoNo.setProximo(this.inicio);
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

		for (int i = 0; i<this.tamanho; i++) {
			int elementoComparado = atual.getProximo().getElemento();
			System.out.println(elementoComparado);

			if (elementoRemovido == elementoComparado) {
				atual.setProximo(atual.getProximo().getProximo());
				tamanho--;
				
				if (elementoComparado == this.inicio.getElemento()) {
					this.inicio = this.inicio.getProximo();
				} else if (elementoComparado == this.ultimo.getElemento()) {
					this.ultimo = this.ultimo.getProximo();
				}
				
			} else {
				atual = atual.getProximo();
			}	
			
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
		builder.append("[");
		
		No atual = this.inicio;
		
		do {
			builder.append(atual.getElemento()).append(", ");
			atual = atual.getProximo();
		} while (atual.getProximo() != this.inicio);
		builder.append(atual.getElemento()).append("]");
		
		return builder.toString();
	}
	
}
