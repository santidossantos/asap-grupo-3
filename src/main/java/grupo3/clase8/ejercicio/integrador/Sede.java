package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Sede {

    private List<Informe> informes;
    private List<Examen> examenes;

    public Sede() {
        this.informes = new ArrayList<>();
        this.examenes = new ArrayList<>();
    }

    public Informe obtenerInforme() {
        return null;
    }

    private double porcentajeExamenesReprobados() {
        int totalExamenes = examenes.size();

        return (double) this.examenes.stream()
                .filter(examen -> !examen.estaAprobado())
                .count() / totalExamenes;
    }

    private double promedioTiempoExamenesAutoAprobados() {
        return this.examenes.stream()
                .filter(exam -> exam instanceof ExamenAuto)
                .mapToDouble(Examen::getPromedioTiempo)
                .average()
                .orElse(0);
    }

}
