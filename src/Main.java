
public class Main {

	
	public static void main(String[] args) {

		Lista lista = new Lista();
	
     	Util.preencherLista10MilElementos_1MilhaoValores(lista);
     
        lista.insertionSort();
          
     	Util.relatorio();
	}
}
