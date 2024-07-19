package grupo3.asapdemy;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private int id;
	private String nombre;
	private List <Curso> cursos;
	
	public Categoria(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.cursos = new ArrayList<>();
	}
	public boolean agregarCurso(Curso curso) {
		return this.cursos.add(curso);
	}
}