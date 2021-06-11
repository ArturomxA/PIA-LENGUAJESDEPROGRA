import javax.swing.JOptionPane;

public class BusquedaVector {
	public static void main(String[] args) {
		int arreglo[] = { 1, 4, 7, 9, 21, 4, 0, 2, 5, 2 };
		int dato;
		boolean band = false;
		dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar"));

		int i = 0;
		while (i < 10 && band == false) {
			if (arreglo[i] == dato) {
				band = true;
			}
			i++;
		}
		if (band == false) {
			JOptionPane.showMessageDialog(null, "El numero no se encuentra en este arreglo");
		} else {
			JOptionPane.showMessageDialog(null, "El numero a sido encontrado en la posicion" + (i - 1));
		}
	}
}
