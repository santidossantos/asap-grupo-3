package grupo3.clase7.comercio.informatico;

import java.util.List;

public class Historial {
	private List<Facturable> facturas;

	public Historial(List<Facturable> facturas) {
		this.facturas = facturas;
	}

	public List<Facturable> getFacturas() {
		return facturas;
	}

	public double montoTotalFacturado() {
		return facturas.stream().mapToDouble(facturable -> facturable.calcularPrecio()).sum();
	}

	public int cantServiciosSimples() {
		return (int) facturas.stream()
				.filter(facturable -> facturable instanceof ServicioDeReparacion
						&& ((ServicioDeReparacion) facturable).getNivelDificultad() < 2)
				.count();
	}

}
