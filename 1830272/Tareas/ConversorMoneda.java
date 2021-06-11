import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorMoneda {
	public static void main(String[] args) {
		String entrada;
		double p, d, e, j, h;
		int opcion;
		DecimalFormat df = new DecimalFormat("#.00");
		String[] options = { "Dólar", "Euro", "Yen Japones", "Dólar Hong Kong" };
		entrada = JOptionPane.showInputDialog("Ingrese la cantidad de pesos que desea convertir: ");
		p = Double.parseDouble(entrada);
		String letrero = "";
		int v = JOptionPane.showOptionDialog(null, "Convertir a: ", "Menú de Monedas", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		entrada = v + "";
		opcion = Integer.parseInt(entrada);
		switch (opcion) {
			default:
				d = p / 19.31;
				JOptionPane.showMessageDialog(null, p + " MXN equivale a " + df.format(d) + " USD");
				break;
			case 1:
				e = p / 21.27;
				JOptionPane.showMessageDialog(null, p + " MXN equivale a " + df.format(e) + " EUR");
				break;
			case 2:
				j = p / 0.18;
				JOptionPane.showMessageDialog(null, p + " MXN equivale a " + df.format(j) + " JPY");
				break;
			case 3:
				h = p / 2.46;
				JOptionPane.showMessageDialog(null, p + " MXN equivale a " + df.format(h) + " HKD");
		}
	}
}