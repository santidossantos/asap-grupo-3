package grupo3.clase8.ejercicio.integrador;

import lombok.Getter;

@Getter
public class ExamenAuto extends Examen {

    private Auto auto;

    public ExamenAuto(String fecha, Auto auto) {
        super(fecha);
        this.auto = auto;
    }

    @Override
    public boolean estaAprobado() {
        return false;
    }

}
