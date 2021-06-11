import java.util.*;

public class SerieA {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int serie = 1;
		boolean sumar = true;
		int cont;
		String cadena = "Serie: ";

		System.out.println("Indique cuantos numeros de la serie quiere ver: ");

		Scanner sc = new Scanner(System.in);
		cont = sc.nextInt();

		do {

			cadena = cadena.concat(String.valueOf(serie) + "  ");
			cont--;
			if (sumar == true) {
				serie += 4;
			} else {
				serie -= 2;
			}

			sumar = !sumar;
		} while (cont > 0);

		System.out.println(cadena);

	}// Fin Main
}// Fin Clase