package listas;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import clases.Persona;

public class UsoLinkedList {

	private static final int LIMITE = 1000;
	private static final Random GENERADOR = new Random();

	public static void main(String[] args) {
		List<Persona> coleccion = new LinkedList<>();
		
		for (int i=1; i <= LIMITE; i++) {
			int n = GENERADOR.nextInt(LIMITE) + 1;
			String dni = String.format("%08dX", n);
			Persona persona = new Persona("Persona aleatoria " + i, dni, i, n);
			coleccion.add(persona);
		}

		for (Persona persona : coleccion) {
			System.out.println(persona);
		}
		System.out.println("Número de elementos: " + coleccion.size());
		Persona persona = new Persona("Lo que sea", "00000001X", 1, 1);
		System.out.println(coleccion.contains(persona));
	}
}
