package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Clase que representa una persona con información básica.
 */
@AllArgsConstructor
@Data
public class Persona {

    /**
     * Nombre de la persona.
     */
    private String nombre;

    /**
     * Apellido de la persona.
     */
    private String apellido;

    /**
     * Documento Nacional de Identidad (DNI) de la persona.
     */
    private String dni;

}
