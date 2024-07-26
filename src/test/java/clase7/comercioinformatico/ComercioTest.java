package clase7.comercioinformatico;

import grupo3.clase7.comercioInformatico.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComercioTest {
    private Insumo insumo1;
    private ServicioDeArmado servicio1;
    private ServicioDeReparacion servicio2;
    private ServicioDeReparacion servicio3;
    private ServicioDeReparacion servicio4;
    private ServicioDeReparacion servicio5;
    private Historial historial;

    @BeforeEach
    void setUp() {
        insumo1 = new Insumo("teclado", 0.1, 15000, TipoDeInsumo.PERIFERICOS);
        servicio1 = new ServicioDeArmado(3);
        servicio2 = new ServicioDeReparacion(4, 4);
        servicio3 = new ServicioDeReparacion(2, 1);
        servicio4 = new ServicioDeReparacion(5, 2);
        servicio5 = new ServicioDeReparacion(6, 3);
        List<Facturable> facturables = Arrays.asList(insumo1, servicio1, servicio2, servicio3, servicio4, servicio5);
        historial = new Historial(facturables);
    }

    @Test
    public void testMontoTotalFacturado() {
        assertEquals(24373.95, historial.montoTotalFacturado());
    }

    @Test
    public void testCantidadDeServiciosSimples() {
        assertEquals(1, historial.cantServiciosSimples());
    }

}
