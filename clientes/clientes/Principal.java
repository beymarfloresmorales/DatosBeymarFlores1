package clientes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Principal {
	
	private static ArrayList<Cliente> clientes=new  ArrayList<Cliente>();
	
	public static void main(String[] args) {
		
		try {
			cargaClientes("/home/programacion/Descargas/clientes.csv");
			System.out.println("Total compras clientes mayores de 30:"+sumaTotalComprasMayoresDe30());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void cargaClientes(String fichero) throws IOException {
		
		clientes= (ArrayList<Cliente>) Files.lines(Paths.get(fichero))
				.skip(1)
				.map(fila -> fila.split(",")) // Stream<String[]>
				.map(datos -> new Cliente(
				Integer.parseInt(datos[0].trim()), // id
				datos[1].trim(), // nombre
				Integer.parseInt(datos[2].trim()), // edad
				datos[3].trim(), // ciudad
				Double.parseDouble(datos[4].trim()), // totalCompras
				Integer.parseInt(datos[5].trim()) // numCompras
				))
			.collect(Collectors.toList()); //
			clientes.forEach(System.out::println);

		
	}
	
	public static double sumaTotalComprasMayoresDe30() {
		return clientes.stream()
				.filter(c->c.getEdad()>30)
					.mapToDouble(s->s.getTotalCompras()).sum();
	}
	
	public static double mediaTotalComprasPorCiudad(String ciudad) {
		return  clientes.stream()
			.filter(c->c.getCiudad().equals(ciudad))
			.mapToDouble(c->c.getTotalCompras()).average().getAsDouble();
		
	}

}
