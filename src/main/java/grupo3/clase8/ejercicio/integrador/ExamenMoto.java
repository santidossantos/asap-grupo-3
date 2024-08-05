package grupo3.clase8.ejercicio.integrador;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un examen específico para una moto, derivada de la clase abstracta {@link Examen}.
 */
public class ExamenMoto extends Examen {

    /**
     * Moto que está siendo evaluada en el examen.
     */
    private Moto moto;

    /**
     * Lista de circuitos asociados al examen de la moto.
     */
    private List<Circuito> circuitos;

    /**
     * Tiempo máximo total permitido para todos los circuitos, en segundos.
     */
    private static final Integer MAX_TIEMPO_TOTAL = 120;

    /**
     * Constructor para crear una instancia de {@code ExamenMoto}.
     *
     * @param fecha La fecha en la que se realizó el examen.
     * @param autor La persona que realizó el examen.
     * @param moto  La moto que está siendo evaluada en el examen.
     */
    public ExamenMoto(String fecha, Persona autor, Moto moto) {
        super(fecha, autor);
        this.moto = moto;
        this.circuitos = new ArrayList<>();
    }

    /**
     * Determina si el examen de la moto está aprobado.
     * Si la cilindrada de la moto es mayor a 150,
     * el examen está aprobado si todos los circuitos están aprobados.
     * Si la cilindrada es 150 o menor,
     * el examen está aprobado si no hay circuitos desaprobados y el tiempo total
     * de todos los circuitos es menor o igual al tiempo máximo total permitido.
     *
     * @return {@code true} si el examen está aprobado según los criterios especificados, {@code false} en caso contrario.
     */
    @Override
    public boolean estaAprobado() {
        Integer cilindrada = this.moto.getCilindrada();

        if (cilindrada > 150) {
            return this.circuitos.stream().allMatch(Circuito::estaAprobado);
        }

        boolean hayDesaprobados = this.circuitos.stream()
                .anyMatch(circ -> !circ.estaAprobado());

        int tiempoTotalCircuitos = this.circuitos.stream()
                .mapToInt(Circuito::getTiempoEnSegundos).sum();

        return !hayDesaprobados && tiempoTotalCircuitos <= MAX_TIEMPO_TOTAL;
    }

    /**
     * Obtiene el promedio de tiempo de todos los circuitos asociados al examen de la moto.
     *
     * @return El promedio de tiempo de los circuitos en segundos. Si no hay circuitos, retorna 0.
     */
    @Override
    public int getPromedioTiempo() {
        return (int) this.circuitos.stream()
                .mapToInt(Circuito::getTiempoEnSegundos)
                .average().orElse(0);
    }

    /**
     * Agrega un circuito a la lista de circuitos del examen de la moto.
     *
     * @param circuito El circuito que se desea agregar.
     */
    public void agregarCircuito(Circuito circuito) {
        this.circuitos.add(circuito);
    }
}
