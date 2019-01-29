package conjuntos;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import clases.Persona;

public class UsoTreeSet {

	private static final int LIMITE = 1000;
	private static final Random GENERADOR = new Random();

	public static void main(String[] args) {
		Set<Persona> coleccion = new TreeSet<>();
		
		for (int i=1; i <= LIMITE; i++) {
			int n = GENERADOR.nextInt(LIMITE) + 1;
			String dni = String.format("%08dX", n);
			Persona persona = new Persona("Persona " + i, dni, i, n);
			coleccion.add(persona);
		}
		/*//Ejemplo de ordenación por el campo que queramos
		ArrayList<Persona> ordenada = new ArrayList<>(coleccion);
		Collections.sort(ordenada, (una, otra) -> una.getNombre().compareTo(otra.getNombre()));

		for (Persona persona : ordenada) {
			System.out.println(persona);
		}
		
		System.out.println("Número de elementos: " + ordenada.size());
		*/
		
		for (Persona persona : coleccion) {
			System.out.println(persona);
		}
		System.out.println("Número de elementos: " + coleccion.size());
		Persona persona = new Persona("Lo que sea", "00000001X", 1, 1);
		System.out.println(coleccion.contains(persona));
		System.out.println();

	}
}
