
public class ListaDETest {

	
	public static void main(String[] args) {

		Lista lista = new Lista();
		lista.inserirFinal(new Elemento(5));
		lista.inserirFinal(new Elemento(3));
		lista.inserirFinal(new Elemento(2));
     	lista.inserirFinal(new Elemento(4));
     	lista.inserirFinal(new Elemento(7));
     	lista.inserirFinal(new Elemento(1));
     	lista.inserirFinal(new Elemento(0));
     	lista.inserirFinal(new Elemento(6));
     	
     	
		lista.insertionSort();
		lista.imprimirLista();
	}
}
