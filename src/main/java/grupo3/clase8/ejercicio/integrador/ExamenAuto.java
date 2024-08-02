package grupo3.clase8.ejercicio.integrador;

import lombok.Getter;

/**
 * Clase que representa un examen específico para un auto, derivada de la clase abstracta {@link Examen}.
 */
@Getter
public class ExamenAuto extends Examen {

    /**
     * Circuito asociado al examen del auto.
     */
    private Circuito circuito;

    /**
     * Auto que está siendo evaluado en el examen.
     */
    private Auto auto;

    /**
     * Tiempo máximo permitido para completar el examen, en segundos.
     */
    private static final Integer TIEMPO_MAXIMO = 90;

    /**
     * Constructor para crear una instancia de {@code ExamenAuto}.
     *
     * @param fecha    La fecha en la que se realizó el examen.
     * @param autor    La persona que realizó el examen.
     * @param circuito El circuito asociado al examen del auto.
     * @param auto     El auto que está siendo evaluado en el examen.
     */
    public ExamenAuto(String fecha, Persona autor, Circuito circuito, Auto auto) {
        super(fecha, autor);
        this.auto = auto;
        this.circuito = circuito;
    }

    /**
     * Determina si el examen del auto está aprobado.
     * El examen se considera aprobado si el tiempo del circuito es menor o igual al tiempo máximo permitido.
     *
     * @return {@code true} si el tiempo en segundos del circuito es menor o igual a {@link #TIEMPO_MAXIMO}, {@code false} en caso contrario.
     */
    @Override
    public boolean estaAprobado() {
        return this.circuito.getTiempoEnSegundos() <= TIEMPO_MAXIMO;
    }

    /**
     * Obtiene el tiempo en segundos del circuito asociado al examen del auto.
     *
     * @return El tiempo en segundos del circuito.
     */
    @Override
    public int getPromedioTiempo() {
        return this.circuito.getTiempoEnSegundos();
    }

}
