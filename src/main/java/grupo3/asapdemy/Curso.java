package grupo3.asapdemy;

import java.util.ArrayList;
import java.util.List;

import grupo3.asapdemy.enums.TipoDeResultado;

import static grupo3.asapdemy.constants.Constants.LIMITE_BECADOS;
import static grupo3.asapdemy.enums.TipoDeResultado.MAX_BECADOS;
import static grupo3.asapdemy.enums.TipoDeResultado.ES_AUTOR;
import static grupo3.asapdemy.enums.TipoDeResultado.YA_SUSCRIPTO;
import static grupo3.asapdemy.enums.TipoDeResultado.SUSCRIPTO_OK;

/**
 * Representa un curso que contiene información sobre su título, precio,
 * valoración, autor, suscriptores y lecciones.
 */
public class Curso {
	private int id;
	private String titulo;
	private int precio;
	private int valoracion;
	private Usuario autor;
	private List<Usuario> suscriptores;
	private List<Leccion> lecciones;

	/**
	 * Constructor para inicializar un curso con su ID, título, precio, valoración y autor.
	 *
	 * @param id El identificador único del curso.
	 * @param titulo El título del curso.
	 * @param precio El precio del curso.
	 * @param valoracion La valoración del curso.
	 * @param autor El autor del curso.
	 */
	public Curso (int id, String titulo, int precio, int valoracion, Usuario autor) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.valoracion = valoracion;
		this.autor = autor;
		this.suscriptores = new ArrayList<>();
		this.lecciones = new ArrayList<>();
	}

	/**
	 * Agrega un suscriptor al curso.
	 *
	 * @param suscriptor El usuario que se quiere suscribir al curso.
	 * @return El resultado de la suscripción.
	 */
	public TipoDeResultado agregarSuscriptor(Usuario suscriptor) {
		if (maxCantSuscriptores()) {
			return MAX_BECADOS;
		}
		else if (suscriptor == this.autor) {
			return ES_AUTOR;
		}
		else if (this.suscriptores.contains(suscriptor)) {
			return YA_SUSCRIPTO;
		}
		this.suscriptores.add(suscriptor);
		return SUSCRIPTO_OK;
	}

	/**
	 * Verifica si se ha alcanzado el límite máximo de suscriptores becados.
	 *
	 * @return true si se ha alcanzado el límite, false en caso contrario.
	 */
	private boolean maxCantSuscriptores(){
		return this.suscriptores.stream().filter(Usuario::isBecado).count() == LIMITE_BECADOS;
	}

	/**
	 * Agrega una lección al curso.
	 *
	 * @param leccion La lección que se quiere agregar al curso.
	 */
	public void agregarLeccion(Leccion leccion) {
		this.lecciones.add(leccion);
	}

	// Getters y setters para los campos de la clase.

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

	public List<Usuario> getSuscriptores() {
		return suscriptores;
	}

	public List<Leccion> getLecciones() {
		return lecciones;
	}
}