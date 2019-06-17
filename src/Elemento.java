
public class Elemento {

	public int valor;
	public Elemento proximo;
	public Elemento anterior;
	public int posicao;

	public Elemento(int valor) {
		this.valor = valor;
		this.proximo = null;
		this.anterior = null;
	}

	public void imprimir() {
		if (!(anterior == null)) {
			System.out.print("\tANTERIOR: " + anterior.valor + "\n");
		}
		System.out.print("\t ATUAL: " + valor);

		if (!(proximo == null)) {
			System.out.print("\nPROXIMO: " + proximo.valor + "\n");
		}
	}

	@Override
	public String toString() {
		return "Elemento [d= " + valor + "]";
	}

}
