import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Util {

	private static Random random;
	private static String horarioInicial;
	private static String horarioFinal;
	public static String algoritmo;
	public static int ciclosClok = 0;
	
	public static void horarioInicial() {
		Calendar c = Calendar.getInstance();

		c.roll(Calendar.HOUR, 24);

		SimpleDateFormat dataFormatada = new SimpleDateFormat("HH:mm:ss ");

		Date date = c.getTime();
		
		horarioInicial = dataFormatada.format(date);
		
	}

	public static void horarioFinal() {
		Calendar c = Calendar.getInstance();

		c.roll(Calendar.HOUR, 24);

		SimpleDateFormat dataFormatada = new SimpleDateFormat("HH:mm:ss ");

		Date date = c.getTime();
		
		horarioFinal = dataFormatada.format(date);
	}

	public static void preencherLista10MilElementos_1MilValores(Lista lista) {
		 random = new Random(1000);

		for (int i = 0; i < 10000; i++) {
			lista.inserirFinal(new Elemento(random.nextInt()));
		}

	}

	public static void preencherLista10MilElementos_1MilhaoValores(Lista lista) {
		 random = new Random(1000000);

		for (int i = 0; i < 10000; i++) {
			lista.inserirFinal(new Elemento(random.nextInt()));
		}
	}
	
	public static void preencherLista100MilElementos_1MilValores(Lista lista) {
		random = new Random(1000);
		
		for (int i = 0; i < 1000000; i++) {
			lista.inserirFinal(new Elemento(random.nextInt()));
		}
	}
	
	public static void preencherLista100MilElementos_1MilhaoValores(Lista lista) {
		random = new Random(1000000);
		

		for (int i = 0; i < 1000000; i++) {
			lista.inserirFinal(new Elemento(random.nextInt()));
		}
	}
	
	public static void relatorio() {
		System.out.println("----- Relatório -----");
		System.out.println("Algoritmo: "+algoritmo);
		System.out.println("Horário Inicial: " + horarioInicial);
		System.out.println("Horário Final: "+horarioFinal);
		System.out.println("Ciclos de Clock: "+ciclosClok);
	}
}
