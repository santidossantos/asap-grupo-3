package grupo3.clase8.ejercicio.integrador;

import lombok.Getter;

@Getter
public class ExamenAuto extends Examen {

    private Auto auto;
    private Circuito circuito;
    private static final Integer TIEMPO_MAXIMO = 90;

    public ExamenAuto(String fecha, Persona autor, Auto auto, Circuito circuito) {
        super(fecha, autor);
        this.auto = auto;
        this.circuito = circuito;
    }

    @Override
    public boolean estaAprobado() {
        return this.circuito.getTiempoEnSegundos() <= TIEMPO_MAXIMO;
    }

    @Override
    public int getPromedioTiempo() {
        return this.circuito.getTiempoEnSegundos();
    }

}
