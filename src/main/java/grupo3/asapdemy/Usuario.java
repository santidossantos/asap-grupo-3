package grupo3.asapdemy;

public class Usuario {
	 private int id;
	 private String nombre;
	 private String mail;
	 private boolean becado;
	 
	 public Usuario(int id, String nombre, String mail, boolean becado) {
		 this.id = id;
		 this.nombre = nombre;
		 this.mail = mail;
		 this.becado = becado;
	 }
	 
	 public boolean isBecado() {
		 return this.becado;
	 }

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
