package clase5.asapdemy;

import grupo3.clase5.asapdemy.Categoria;
import grupo3.clase5.asapdemy.Curso;
import grupo3.clase5.asapdemy.Leccion;
import grupo3.clase5.asapdemy.Usuario;
import grupo3.clase5.asapdemy.enums.TipoDeLeccion;
import grupo3.clase5.asapdemy.enums.TipoDeResultado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static grupo3.clase5.asapdemy.enums.TipoDeResultado.CURSO_INEX;
import static grupo3.clase5.asapdemy.enums.TipoDeResultado.USUARIO_INEX;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AsapDemyTest {

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


    /**
     * Método que se ejecuta antes de cada prueba para inicializar los objetos necesarios.
     */
    @BeforeEach
    void setUp() {
        this.u1 = new Usuario(1, "Juan", "juan@gmail.com", false);
        this.u2 = new Usuario(2, "Pablo", "pablo@gmail.com", false);
        this.u3 = new Usuario(3, "Paula", "pau@gmail.com", false);
        this.becado1 = new Usuario(4, "Juan Carlos Java", "juanCarlosJAVA@gmail.com", true);
        this.becado2 = new Usuario(5, "Nico", "nico@gmail.com", true);
        this.becado3 = new Usuario(6, "Nahuel", "nahuel@gmail.com", true);
        this.becado4 = new Usuario(7, "Manuel", "manuel@gmail.com", true);
        this.becado5 = new Usuario(8, "Amira", "amira@gmail.com", true);
        this.becado6 = new Usuario(9, "Pepe", "pepe@gmail.com", true);
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

    /**
     * Método para suscribir un usuario a un curso.
     *
     * @param idUsuario El ID del usuario que se quiere suscribir.
     * @param idCurso El ID del curso al que se quiere suscribir el usuario.
     * @return El resultado de la suscripción.
     */
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

    /**
     * Prueba que verifica la suscripción exitosa de un usuario a un curso.
     */
    @Test
    void testSuscribirseACursoOk() {
        Curso curso = this.cursos.stream().findFirst().orElse(null);
        assertEquals(TipoDeResultado.SUSCRIPTO_OK, suscribirseACurso(u1.getId(), curso.getId()));
        assertEquals(TipoDeResultado.SUSCRIPTO_OK, suscribirseACurso(this.becado1.getId(), curso.getId()));
        assertEquals(2, curso.getSuscriptores().size());
    }

    /**
     * Prueba que verifica el comportamiento cuando el usuario no existe.
     */
    @Test
    void testUsuarioInexistente() {
    	assertEquals(TipoDeResultado.USUARIO_INEX, suscribirseACurso(11,2));
    }

    /**
     * Prueba que verifica el comportamiento cuando el curso no existe.
     */
    @Test
    void testCursoInexistente() {
    	assertEquals(TipoDeResultado.CURSO_INEX, suscribirseACurso(3,3));
    }

    /**
     * Prueba que verifica el comportamiento cuando el usuario ya está suscrito al curso.
     */
    @Test
    void testUsuarioYaInscripto() {
    	suscribirseACurso(5,2);
    	assertEquals(TipoDeResultado.YA_SUSCRIPTO, suscribirseACurso(5,2));
    }

    /**
     * Prueba que verifica el comportamiento cuando se alcanza el máximo de usuarios becados en un curso.
     */
    @Test
    void testMaximoDeInscriptos() {
    	suscribirseACurso(5,2);
    	suscribirseACurso(6,2);
    	suscribirseACurso(7,2);
    	suscribirseACurso(8,2);
    	suscribirseACurso(9,2);
    	assertEquals(TipoDeResultado.MAX_BECADOS, suscribirseACurso(4,2));
    }

    /**
     * Prueba que verifica el comportamiento cuando el usuario es el autor del curso.
     */
    @Test
    void testUsuarioEsAutor() {
    	assertEquals(TipoDeResultado.ES_AUTOR, suscribirseACurso(2,1));
    }

}
