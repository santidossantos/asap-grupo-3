package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Vehiculo {

    private String patente;
    private String marca;
    private Integer cilindrada;

}
