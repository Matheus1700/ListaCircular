package teste;

import lista.ListaCircular;

public class Main {

	public static void main(String[] args) {
		ListaCircular lc = new ListaCircular();
		System.out.println("Lista Vazia: " + lc.listaVazia());
		
		lc.inserirElemento(1);
		lc.inserirElemento(4);
		lc.inserirElemento(2);
		lc.inserirElemento(4);
		lc.inserirElemento(0);
		lc.inserirElemento(10);
		
		System.out.println("Lista Completa: " + lc.imprimirLista());
		System.out.println("Lista Vazia: " + lc.listaVazia());
		System.out.println("Tamanho da Lista: " + lc.getTamanho());
		
		// remover um elemento
		/*
		 * ---- Não tá removendo o primeiro elemento (problema no FOR)
		 */
		lc.removerElemento(0);
		System.out.println(lc.imprimirLista());
	}

}
