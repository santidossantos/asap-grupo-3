package grupo3.asapdemy;

import java.util.ArrayList;
import java.util.List;
/**
 * Representa una categoría que contiene una lista de cursos.
 */
public class Categoria {
	private int id;
	private String nombre;
	private List <Curso> cursos;

	/**
	 * Constructor para inicializar una categoría con un ID y un nombre.
	 *
	 * @param id El identificador único de la categoría.
	 * @param nombre El nombre de la categoría.
	 */
	public Categoria(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.cursos = new ArrayList<>();
	}

	/**
	 * Agrega un curso a la lista de cursos de la categoría.
	 *
	 * @param curso El curso que se desea agregar a la categoría.
	 * @return true si el curso se agregó exitosamente, false en caso contrario.
	 */
	public boolean agregarCurso(Curso curso) {
		return this.cursos.add(curso);
	}
}