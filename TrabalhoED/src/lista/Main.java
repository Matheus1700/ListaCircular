package lista;

public class Main {

	public static void main(String[] args) {
		ListaCircular lc = new ListaCircular();
		
		// mostrando que a lista esta vazio
		System.out.println("Lista Vazia: " + lc.listaVazia());
		
		// inserindo apenas 1 elemento
		lc.inserirElemento(1);
		System.out.println("Lista com 1 elemento: " + lc.imprimirLista());
		
		
		// inserindo mais 2 elementos
		lc.inserirElemento(4);
		lc.inserirElemento(2);
		System.out.println("Lista com 3 elementos: " + lc.imprimirLista());
		
		
		// inserindo 1 elemento repetido
		lc.inserirElemento(4);
		System.out.println("Lista com elementos repetidos: " + lc.imprimirLista());
		
		
		// inserindo 1 elemento menor do que o primeiro elemento
		lc.inserirElemento(0);
		System.out.println("Lista com o menor numero adicionado: " + lc.imprimirLista());
		
		
		// inserindo 1 elemento maior do que o ultimo
		lc.inserirElemento(10);
		System.out.println("Lista com o maior numero adicionado: " + lc.imprimirLista());
		
		
		// mostrando que a lista nao esta vazia
		System.out.println("Lista Vazia: " + lc.listaVazia());
		
		
		// removendo o primeiro elemento
		lc.removerElemento(0);
		System.out.println("Lista sem o '0': " + lc.imprimirLista());
		
		
		// removendo o ultimo elemento
		lc.removerElemento(10);
		System.out.println("Lista sem o '10': " + lc.imprimirLista());
		
		
		// removendo um elemento do meio
		lc.removerElemento(2);
		System.out.println("Lista sem o '2': " + lc.imprimirLista());
		
		
		// removendo elementos repetidos 
		lc.removerElemento(4);
		System.out.println("Lista sem o '4': " + lc.imprimirLista());
		
		
		// removendo o resto e mostrando que a lista esta vazia
		lc.removerElemento(1);
		System.out.println("Lista Vazia: " + lc.imprimirLista());
		System.out.println("Lista Vazia (boolean): " + lc.listaVazia());
		
		
		// tentando remover um elemento que nao existe
		lc.removerElemento(20);
		System.out.println("Lista: " + lc.imprimirLista());
		
		
		// preenchendo a lista novamente
		lc.inserirElemento(3);
		lc.inserirElemento(1);
		lc.inserirElemento(5);
		lc.inserirElemento(4);
		lc.inserirElemento(4);
		lc.inserirElemento(0);
		
		
		// imprimindo a lista que foi preenchida 
		System.out.println(lc.imprimirLista());

		
		// mostrando que ela retorna que a lista nao esta vazia
		System.out.println("Lista Vazia: " + lc.listaVazia());				
	}
}
