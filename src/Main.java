
public class Main {

	
	public static void main(String[] args) {

		Lista lista = new Lista();
	
     	Util.preencherLista10MilElementos_1MilValores(lista);
     
     	lista.bubbleSort();
     	
     	Util.relatorio();
	}
}
