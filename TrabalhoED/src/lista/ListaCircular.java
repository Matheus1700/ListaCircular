package lista;

public class ListaCircular {

	private No inicio;
	private No ultimo;
	
	public ListaCircular() {
		this.inicio = null;
		this.ultimo = null;
	}
	
	public void inserirElemento(int elementoNovo) {
		No novoNo = new No(elementoNovo);
		
		if (listaVazia() == true) {
			this.inicio = novoNo;
			this.ultimo = novoNo;
			novoNo.setProximo(novoNo);
			return;
		}
		
		if (novoNo.getElemento() < this.inicio.getElemento()) {
			novoNo.setProximo(this.inicio);
			this.inicio = novoNo;
			this.ultimo.setProximo(novoNo);
			return;
		}
		
		if (novoNo.getElemento() > ultimo.getElemento()) {
			this.ultimo.setProximo(novoNo);
			novoNo.setProximo(this.inicio);
			this.ultimo = novoNo;
			return;
		}
		
		// condicao padrao
		for (No atual = this.inicio; atual.getProximo() != this.inicio; atual = atual.getProximo()) {
			int elementoAtual = atual.getElemento();
			int elementoProximo = atual.getProximo().getElemento();
			
			if (novoNo.getElemento() > elementoAtual && novoNo.getElemento() <= elementoProximo) {
				novoNo.setProximo(atual.getProximo());
				atual.setProximo(novoNo);
				return;
			}
		}	
	}
	
	
	public void removerElemento(int elementoRemovido) {
		No atual = this.ultimo;
		int elementoComparado;
		boolean existeNaLista = false; 
		
		do {
			elementoComparado = atual.getProximo().getElemento();
			
			if (elementoComparado == elementoRemovido) {
				existeNaLista = true;
				
				if (this.inicio != this.ultimo) {
					atual.setProximo(atual.getProximo().getProximo());
				} else {
					this.inicio = null;
					break;
				}
				
				// se o elemento for igual ao primeiro
				if (elementoRemovido == this.inicio.getElemento()) {
					this.inicio = atual.getProximo();
					this.ultimo.setProximo(this.inicio);
				}
							
				// se o elemento for igual ao ultimo
				if (elementoRemovido == this.ultimo.getElemento()) {
					this.ultimo = atual;
					this.ultimo.setProximo(this.inicio);
				}
								
			} else {
				atual = atual.getProximo();
			}
			
		} while (atual != this.ultimo);
		
		if (existeNaLista == false) { 
			System.out.println("Elemento '" +elementoRemovido+ "' nao existe na lista!");
		}
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
	
	
}
