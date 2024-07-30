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
        return 0;
    }

    private double promedioTiempoExamenesAutoAprobados() {
        return 0;
    }

}
