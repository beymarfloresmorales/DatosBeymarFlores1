package agenciaalquilervehiculos;

public class NoEncontradoException extends Exception {

	public NoEncontradoException() {
		super("Matricula no encontrada");
	}
}
