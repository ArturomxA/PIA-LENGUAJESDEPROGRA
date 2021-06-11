import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ConversorTemperatura {
	public static void main(String[] args) {
		String entrada;
		double n, c, f;
		int opcion;
		DecimalFormat df = new DecimalFormat("#.0");
		String[] options = { "°C a °F", "°F a °C", "EXIT" };
		entrada = JOptionPane.showInputDialog("Ingrese el valor de temperatura que desea convertir: ");
		n = Double.parseDouble(entrada);
		String letrero = "";
		int v = JOptionPane.showOptionDialog(null, "Convertir de: ", "Menú de Escalas",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		entrada = v + "";
		opcion = Integer.parseInt(entrada);
		switch (opcion) {
			case 1:
				c = (n - 32) * 5 / 9;
				JOptionPane.showMessageDialog(null, n + " °F equivale a " + df.format(c) + " °C");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Click en ACEPTAR para salir");
				break;
			default:
				f = (n * 9 / 5) + 32;
				JOptionPane.showMessageDialog(null, n + " °C equivale a " + df.format(f) + " °F");
				break;
		}
	}
}
