
public class Main {

	
	public static void main(String[] args) {

		Lista lista = new Lista();
	
     	lista.inserirFinal(new Elemento(3));
     	lista.inserirFinal(new Elemento(0));
     	lista.inserirFinal(new Elemento(6));
     	lista.inserirFinal(new Elemento(1));
     	
     	lista.insertionSort();
     	
     	lista.imprimirLista();
	}
}
