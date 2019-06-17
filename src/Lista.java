
public class Lista {

	public Elemento inicio;
	public int size;
	private Elemento elemProximo = null;

	public Lista() {
		this.inicio = null;
		this.size = 0;
	}

	public void inserirInicio(Elemento elem) {
		Elemento auxElem = this.inicio;

		if (auxElem == null) {
			// elem.anterior = null;
			elem.proximo = this.inicio;
			this.inicio = elem;
		} else {
			// elem.anterior = null;
			elem.proximo = this.inicio;
			this.inicio.anterior = elem;
			this.inicio = elem;
		}

		elem.posicao = size;
		this.size++;

		/*
		 * Solução do Mauricio
		 * 
		 * if(!(novo.proximo == null)){ novo.prox.ant = novo; }
		 * 
		 * 
		 */

	}

	public void inserirFinal(Elemento elem) {

		if (this.inicio == null) {
			inserirInicio(elem);
			return;
		}
		Elemento auxElem = this.inicio;

		while (auxElem.proximo != null) {
			auxElem = auxElem.proximo;
		}

		auxElem.proximo = elem;
		elem.anterior = auxElem;

		elem.posicao = size;

		this.size++;
	}

	public void imprimirLista() {
		Elemento aux = inicio;

		while (aux != null) {
			aux.imprimir();
			aux = aux.proximo;
		}
	}

	public void bubbleSort() {

		Elemento aux1 = null;
		Elemento aux2 = null;
		Elemento aux3 = this.inicio;

		boolean troca = false;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {

				if (aux3 == null) {
					break;
				}

				if (aux3.proximo != null) {
					// if(getElem(j).valor > getElem(j + 1).valor) {
					if (aux3.valor > aux3.proximo.valor) {

						aux1 = aux3;
						aux2 = aux3.proximo;
						trocarElementos(aux1, aux2);
						troca = true;
						// }
					}
				}
				aux3 = aux3.proximo;
			}
			aux3 = this.inicio;

			if (troca) {
				troca = false;
			} else {
				break;
			}

		}

	}

	public void trocarElementos(Elemento aux1, Elemento aux2) {

		if (aux1 == inicio) {
			inicio = aux2;
		}

		Elemento aux3 = aux1.proximo;
		aux1.proximo = aux2.proximo;
		aux2.proximo = aux3;

		if (aux1.proximo != null) {
			aux1.proximo.anterior = aux1;
		}

		if (aux2.proximo != null) {
			aux2.proximo.anterior = aux2;
		}

		Elemento aux4 = aux1.anterior;
		aux1.anterior = aux2.anterior;
		aux2.anterior = aux4;

		if (aux1.anterior != null) {
			aux1.anterior.proximo = aux1;
		}

		if (aux2.anterior != null) {
			aux2.anterior.proximo = aux2;
		}
	}

//	public Elemento getElem(int posicao) {
//		Elemento aux = this.inicio;
//
//		for (int i = 0; i < size; i++) {
//			if (aux.posicao == posicao) {
//				break;
//			}
//			aux = aux.proximo;
//		}
//
//		if (aux != null) {
//			return aux;
//		} else {
//			return aux;
//		}
//	}

	public void selectSort() {
		Elemento aux1 = this.inicio;
		Elemento aux2 = null;
		Elemento aux3 = this.inicio;
		Elemento aux4 = null;

		while (aux1.proximo != null) {
			
			aux2 = aux1;
			while (aux2 != null) {

				if (aux2.valor < aux3.valor) {
					aux3 = aux2;
				}

				aux2 = aux2.proximo;
			}
			aux4 = aux1;

			trocarElementosSelectionSort(aux4, aux3);

			aux1 = elemProximo;
			aux3 = elemProximo.proximo;
			aux1 = aux1.proximo;
		}
	}

	private void trocarElementosSelectionSort(Elemento aux1, Elemento aux2) {

		if(aux1 == inicio) {
			inicio = aux2;
		}
		
		Elemento aux3 = aux2.proximo;

		if (aux1.proximo != null) {
			if (aux1.proximo.valor == aux2.valor) {
				aux2.proximo = aux1;
			} else {

				aux2.proximo = aux1.proximo;
			}
		}
		aux1.proximo = aux3;

		aux2.anterior = aux1.anterior;

		if (aux2.proximo != null) {
			aux2.proximo.anterior = aux2;
			if (aux2.proximo.valor != aux1.valor) {
				aux2.proximo.proximo = aux1;
				
			}

		}
		
		if(aux2.anterior != null) {
			aux2.anterior.proximo = aux2;
		}
		

		if (aux1.anterior != null) {
			if (aux1.anterior.valor != aux2.valor) {
				aux1.anterior = aux2.proximo;
			}
		} else {
			aux1.anterior = aux2.proximo;
		}

		if (aux1.proximo != null) {
			aux1.proximo.anterior = aux1;
		}

		elemProximo = aux2;
	}

}
