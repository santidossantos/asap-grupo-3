package grupo3.asapdemy;

import java.util.ArrayList;
import java.util.List;

import enums.TipoDeResultado;

public class Curso {
	private int id;
	private String titulo;
	private int precio;
	private int valoracion;
	private Usuario autor;
	private List<Usuario> suscriptores;
	
	public Curso (int id, String titulo, int precio, int valoracion, Usuario autor) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.valoracion = valoracion;
		this.autor = autor;
		this.suscriptores = new ArrayList<>();
	}
	
	public TipoDeResultado agregarSuscriptor(Usuario suscriptor) {
		if (maxCantSuscriptores()) {
			return MAX_BECADOS;
		}
		else if (suscriptor == this.autor) {
			return false;
		}
		else if (this.suscriptores.contains(suscriptor)) {
			return false;
		}
		return this.suscriptores.add(suscriptor);
	}
	
	private boolean maxCantSuscriptores(){
		return this.suscriptores.stream().filter(Usuario::isBecado).count()>5;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
}