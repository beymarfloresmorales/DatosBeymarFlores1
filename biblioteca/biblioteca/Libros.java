package biblioteca;
public class Libros {

	private String isbn, titulo;
	private boolean prestado;
	private Autor autor;
	
	public Libros(String isbn, String titulo, Autor autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		prestado = false;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public  Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void prestarLibro() {
		if (prestado) {
			System.out.println("el libro " + titulo + " ya esta prestado y no se puede prestar");
		}else {
			prestado = true;
			System.out.println("El libro "+ titulo + " ha sido prestado con exito");
		}
	}
	public void devolverLibro() {
		if(!prestado) {
			System.out.println("El libro " + titulo + " no esta prestado, no se puede devolver");
		}else {
			prestado = false;
			System.out.println("El libro " + titulo + " ha sido devuelto con exito");
		}
	}
	
	public String toString() {
		return "Libro:"+isbn+ " "+titulo+" "+(prestado?"prestado":"no prestado"+
				" Autor:"+autor);
	}
}