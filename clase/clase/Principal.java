package clase;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de 2 alumnos");
		String nombre1 = sc.next();
		String nombre2 = sc.next();
		Alumno alumno1 = new Alumno(nombre1);
		Alumno alumno2 = new Alumno(nombre2);
		System.out.println("Introduce las notas de los 3 trimestres de " + alumno1.getNombre());
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		alumno1.evaluar(nota1, nota2, nota3);
		System.out.println("Introduce las notas de los 3 trimestres de " + alumno2.getNombre());		
		int nota4 = sc.nextInt();
		int nota5 = sc.nextInt();
		int nota6 = sc.nextInt();
		alumno2.evaluar(nota4, nota5, nota6);
		if(alumno1.getNotafinal() > alumno2.getNotafinal()) {
			System.out.println(alumno1.toString());
		}else if (alumno1.getNotafinal() < alumno2.getNotafinal()){
			System.out.println(alumno2.toString());
		}
		else {
			System.out.println(alumno1.toString());
			System.out.println(alumno2.toString());
		}
	}

} 
