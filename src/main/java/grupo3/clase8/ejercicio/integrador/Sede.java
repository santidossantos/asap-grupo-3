package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una sede que gestiona una lista de exámenes.
 */
@AllArgsConstructor
public class Sede {

    /**
     * Lista de exámenes gestionados por la sede.
     */
    private List<Examen> examenes;

    /**
     * Constructor por defecto que inicializa la lista de exámenes como una lista vacía.
     */
    public Sede() {
        this.examenes = new ArrayList<>();
    }

    /**
     * Obtiene un informe con las estadísticas de los exámenes en la sede.
     *
     * @return Un objeto {@link Informe} que contiene el porcentaje de exámenes reprobados y el promedio de tiempo
     *         de los exámenes auto aprobados.
     */
    public Informe obtenerInforme() {
        return new Informe(this.porcentajeExamenesReprobados(),
                this.promedioTiempoExamenesAutoAprobados());
    }

    /**
     * Calcula el porcentaje de exámenes que fueron reprobados en la sede.
     *
     * @return El porcentaje de exámenes reprobados en la sede.
     */
    private double porcentajeExamenesReprobados() {
        int totalExamenes = examenes.size();

        if (totalExamenes == 0) {
            return 0;
        }

        double porcentajeExamenesReprobados = (double) this.examenes.stream()
                .filter(examen -> !examen.estaAprobado())
                .count() / totalExamenes;

        return porcentajeExamenesReprobados * 100;
    }

    /**
     * Calcula el promedio de tiempo de los exámenes de tipo {@link ExamenAuto} que están aprobados.
     *
     * @return El promedio de tiempo en segundos de los exámenes auto aprobados. Retorna 0 si no hay exámenes aprobados.
     */
    private double promedioTiempoExamenesAutoAprobados() {
        return this.examenes.stream()
                .filter(exam -> exam instanceof ExamenAuto && exam.estaAprobado())
                .mapToDouble(Examen::getPromedioTiempo)
                .average()
                .orElse(0);
    }

    /**
     * Agrega un examen a la lista de exámenes de la sede.
     *
     * @param examen El examen que se desea agregar.
     */
    public void agregarExamen(Examen examen) {
        this.examenes.add(examen);
    }
}
