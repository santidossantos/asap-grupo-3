package grupo3.asapdemy;

import enums.TipoDeLeccion;
import enums.TipoDeResultado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static enums.TipoDeResultado.CURSO_INEX;
import static enums.TipoDeResultado.USUARIO_INEX;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AsapdemyTest {

    Usuario u1;
    Usuario u2;
    Usuario u3;
    Usuario becado1;
    Usuario becado2;
    Usuario becado3;
    Usuario becado4;
    Usuario becado5;
    Usuario becado6;
    List<Usuario> usuarios;
    List<Curso> cursos;

    @BeforeEach
    void setUp() {
        this.u1 = new Usuario(1, "Juan", "juan@gmail.com", false);
        this.u2 = new Usuario(2, "Pablo", "pablo@gmail.com", false);
        this.u3 = new Usuario(3, "Paula", "pau@gmail.com", false);
        this.becado1 = new Usuario(4, "Naza", "naza@gmail.com", true);
        this.becado2 = new Usuario(5, "Nico", "sjksdjsk@gmail.com", true);
        this.becado3 = new Usuario(6, "Nahuel", "sjlshjs", true);
        this.becado4 = new Usuario(7, "Nahuel", "sjlshjs", true);
        this.becado5 = new Usuario(8, "Nahuel", "sjlshjs", true);
        this.becado6 = new Usuario(9, "Nahuel", "sjlshjs", true);
        this.usuarios = List.of(u1, u2, u3, becado1, becado2, becado3, becado4, becado5, becado6);

        Curso curso1 = new Curso(1, "Java", 10, 1000, u2);
        Curso curso2 = new Curso(2, "Python", 20, 2000, u2);
        this.cursos = Arrays.asList(curso1, curso2);

        Categoria cat1 = new Categoria(1, "Programacion");
        cat1.agregarCurso(curso1);
        cat1.agregarCurso(curso2);

        Leccion leccion1 = new Leccion("Introduccion", 25, TipoDeLeccion.RECURSO);
        Leccion leccion2 = new Leccion("Variables", 30, TipoDeLeccion.VIDEO);

        curso1.agregarLeccion(leccion1);
        curso1.agregarLeccion(leccion2);
    }

    public TipoDeResultado suscribirseACurso(int idUsuario, int idCurso) {
        Usuario usuario = this.usuarios.stream().filter(u -> u.getId() == idUsuario).findFirst().orElse(null);
        Curso curso = this.cursos.stream().filter(c -> c.getId() == idCurso).findFirst().orElse(null);

        if(usuario == null ) {
            return USUARIO_INEX;
        }

        if(curso == null) {
            return CURSO_INEX;
        }

        return curso.agregarSuscriptor(usuario);
    }

    @Test
    void testSuscribirseACursoOk() {
        Curso curso = this.cursos.stream().findFirst().orElse(null);
        assertEquals(TipoDeResultado.SUSCRIPTO_OK, suscribirseACurso(u1.getId(), curso.getId()));
        assertEquals(TipoDeResultado.SUSCRIPTO_OK, suscribirseACurso(this.becado1.getId(), curso.getId()));
        assertEquals(2, curso.getSuscriptores().size());
    }

    @Test
    void testUsuarioInexistente() {
    }

    @Test
    void testCursoInexistente() {
    }

    @Test
    void testUsuarioYaInscripto() {
    }

    @Test
    void testMaximoDeInscriptos() {
    }

    @Test
    void testUsuarioEsAutor() {
    }


}
