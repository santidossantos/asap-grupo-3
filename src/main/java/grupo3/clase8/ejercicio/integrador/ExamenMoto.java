package grupo3.clase8.ejercicio.integrador;

public class ExamenMoto extends Examen {

    private Moto moto;

    public ExamenMoto(String fecha, Moto moto) {
        super(fecha);
        this.moto = moto;
    }

    @Override
    public boolean estaAprobado() {
        return false;
    }
}
