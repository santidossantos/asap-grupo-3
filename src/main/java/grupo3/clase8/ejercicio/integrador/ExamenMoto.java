package grupo3.clase8.ejercicio.integrador;

import java.util.List;

public class ExamenMoto extends Examen {

    private Moto moto;
    private List<Circuito> circuitos;
    private static final Integer MAX_TIEMPO_TOTAL = 120;

    public ExamenMoto(String fecha, Persona autor, Moto moto, List<Circuito> circuitos) {
        super(fecha, autor);
        this.moto = moto;
        this.circuitos = circuitos;
    }

    @Override
    public boolean estaAprobado() {
        Integer cilindrada = this.moto.getCilindrada();

        if(cilindrada > 150) {
            return this.circuitos.stream().allMatch(Circuito::estaAprobado);
        }

        boolean superoMaxDesaprobados = this.circuitos.stream().
                    anyMatch(circ -> !((circ.estaAprobado())));

        int tiempoTotalCircuitos = this.circuitos.stream()
                    .mapToInt(Circuito::getTiempoEnSegundos).sum();

        return (!(superoMaxDesaprobados)) && (tiempoTotalCircuitos <= MAX_TIEMPO_TOTAL);
    }

    @Override
    public int getPromedioTiempo() {
        return (int) this.circuitos.stream()
                .mapToInt(Circuito::getTiempoEnSegundos)
                .average().orElse(0);
    }
}
