package grupo3.asapdemy;

/**
 * Representa un usuario del sistema.
 */
public class Usuario {
	 private int id;
	 private String nombre;
	 private String mail;
	 private boolean becado;

	/**
	 * Constructor para inicializar un usuario con su ID, nombre, correo electrónico y estado de beca.
	 *
	 * @param id El identificador único del usuario.
	 * @param nombre El nombre del usuario.
	 * @param mail El correo electrónico del usuario.
	 * @param becado Indica si el usuario está becado.
	 */
	 public Usuario(int id, String nombre, String mail, boolean becado) {
		 this.id = id;
		 this.nombre = nombre;
		 this.mail = mail;
		 this.becado = becado;
	 }

	/**
	 * Verifica si el usuario está becado.
	 *
	 * @return true si el usuario está becado, false en caso contrario.
	 */
	 public boolean isBecado() {
		 return this.becado;
	 }

	// Getters para los campos de la clase.


	 public int getId() {
		return id;
	 }

	 public String getNombre() {
		return nombre;
	 }

	  public String getMail() {
		return mail;
	 }
}
