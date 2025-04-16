package conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Ejercico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
		// Rellenar la lista
		for (int i=0; i<20;i++) {
			int numero=(int)(Math.random()*10)+1;
			listaNumeros.add(numero);
		}
		Collections.sort(listaNumeros);
		System.out.println("Lista de numeros");		
		System.out.println(listaNumeros.toString());
		
		//Elementos distintos
		TreeSet<Integer> numeroDistintos=new TreeSet<Integer>();
//		for (Integer i: listaNumeros) {
//			numeroDistintos.add(i);
//		}
		numeroDistintos.addAll(listaNumeros);		
		System.out.println(numeroDistintos);
		
		//Elementos repetidos
		TreeSet<Integer> elementosRepetidos= new TreeSet<Integer>();
		for (Integer i: numeroDistintos ) {
			listaNumeros.remove(i);
		}
		elementosRepetidos.addAll(listaNumeros);
		System.out.println(elementosRepetidos);
		
		//Elementos que aparecen una sola vez
		TreeSet<Integer> elementosNoRepetidos=new TreeSet<>();
		for (Integer i: elementosRepetidos) {
			numeroDistintos.remove(i);
		}
		elementosNoRepetidos.addAll(numeroDistintos);
		System.out.println(elementosNoRepetidos);
		
		
	}

}
