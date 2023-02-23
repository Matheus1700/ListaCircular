package teste;

import lista.ListaCircular;

public class Main {

	public static void main(String[] args) {
		ListaCircular <Integer> lista = new ListaCircular<>();
		
		// imprimindo uma lista vazia
		System.out.println(lista.imprimir());
		
		// tentando remover algo de uma lista vazia
		lista.removerElemento(4);
		
		// Inserindo apenas um valor em uma lista vazia
		lista.inserir(1);
		System.out.println(lista.imprimir());
		
		// inserindo mais valores
		lista.inserir(2);
		lista.inserir(3);
		System.out.println(lista.imprimir());
		
		/*
		// imprimindo a lista e mostrando os proximos valores junto
		System.out.println(lista.imprimir());
		System.out.println("Tamanho da Lista: " + lista.getTamanho());
		
		// removendo o primeiro elemento da lista
		lista.removerElemento(1);
		System.out.println("Imprimindo apos remover o '1':\n" + lista.imprimir());
		
		// adicionando mais um elemento no final da lista
		lista.inserir(4);

		// removendo o elemento do meio
		lista.removerElemento(2);
		System.out.println("Imprimindo apos remover o '2':\n" + lista.imprimir());
		*/
	}

}
