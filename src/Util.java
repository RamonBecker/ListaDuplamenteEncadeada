import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {

	public static void horarioInicial() {
		Calendar c = Calendar.getInstance();

		c.roll(Calendar.HOUR, 24);

		SimpleDateFormat dataFormatada = new SimpleDateFormat("HH:mm ");

		Date date = c.getTime();

		System.out.println("Horário Inicial: " + dataFormatada.format(date));
	}

	public static void horarioFinal() {
		Calendar c = Calendar.getInstance();

		c.roll(Calendar.HOUR, 24);

		SimpleDateFormat dataFormatada = new SimpleDateFormat("HH:mm ");

		Date date = c.getTime();

		System.out.println("Horario Final: " + dataFormatada.format(date));
	}

}
