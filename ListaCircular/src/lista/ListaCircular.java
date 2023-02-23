package lista;

public class ListaCircular<T>{

	private No<T> inicio;
	private No<T> ultimo;
	private int tamanho = 0;
	
	// inserindo um atras do outro
	public void inserir(T elemento) {
		/* Sem usar a variavel 'ultimo'
		No<T> noPenultimo = this.inicio;
		for (int i = 0; i < (tamanho-1); i++) {
			noPenultimo = noPenultimo.getProximo();
		}
		*/

		No<T> novoNo = new No<T>(elemento);
		if (tamanho == 0) {
			this.inicio = novoNo;
			novoNo.setProximo(novoNo);
		} else {
			//noPenultimo.setProximo(novoNo);
			ultimo.setProximo(novoNo);
			novoNo.setProximo(this.inicio);
		}
		
		this.ultimo = novoNo;
		tamanho++;
	}
	
	public void removerElemento(T elementoRemover) {
		if (this.tamanho == 0) {
			System.out.println("Nao tem nada para se remover");
			return;
		}
		
		No<T> noAtual = this.inicio;
		if (noAtual.getElemento() == elementoRemover) {
			this.inicio = noAtual.getProximo();
			this.ultimo.setProximo(this.inicio);
			tamanho--;
			return;
		}
		
		do {
			
			if (noAtual.getProximo().getElemento() == elementoRemover) {
				noAtual.setProximo(noAtual.getProximo().getProximo());
				tamanho--;
				return;
			}
			noAtual = noAtual.getProximo();
			
		} while (noAtual.getProximo() != this.inicio);	
	}
	
	
	public int getTamanho() {
		return tamanho;
	}
	
	
	public String imprimir() {
		if (tamanho == 0) {
			return "[Lista Vazia]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		No<T> noAtual = this.inicio;
		
		while (noAtual.getProximo() != this.inicio) {
			builder.append(noAtual.getElemento()).append(" -- Proximo: ");
			builder.append(noAtual.getProximo().getElemento()).append("; ");
			noAtual = noAtual.getProximo();
		}
		builder.append(noAtual.getElemento()).append(" -- Proximo: ");
		builder.append(noAtual.getProximo().getElemento()).append("]");
		
		return builder.toString();
	}
	
}
