package grupo3.clase8.ejercicio.integrador;

import lombok.Getter;

@Getter
public class Circuito implements Evaluable {

    private Integer tiempoEnSegundos;
    private Integer faltasCometidas;

    public boolean estaAprobado() {
        return this.faltasCometidas <= 2;
    }

}
