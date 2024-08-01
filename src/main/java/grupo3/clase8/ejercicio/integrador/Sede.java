package grupo3.clase8.ejercicio.integrador;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Sede {

    private List<Examen> examenes;

    public Sede() {
        this.examenes = new ArrayList<>();
    }

    public Informe obtenerInforme() {
        return new Informe(this.porcentajeExamenesReprobados(),
                this.promedioTiempoExamenesAutoAprobados());
    }

    private double porcentajeExamenesReprobados() {
        int totalExamenes = examenes.size();

        double porcentajeExamenesReprobados =  (double) this.examenes.stream()
                .filter(examen -> !examen.estaAprobado())
                .count() / totalExamenes;

        return porcentajeExamenesReprobados * 100;
    }

    private double promedioTiempoExamenesAutoAprobados() {
        return this.examenes.stream()
                .filter(exam -> exam instanceof ExamenAuto && exam.estaAprobado())
                .mapToDouble(Examen::getPromedioTiempo)
                .average()
                .orElse(0);
    }

    public void agregarExamen(Examen examen) {
    	this.examenes.add(examen);
    }
}
