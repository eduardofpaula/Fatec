package com.example.TDDPractice.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {
    @Test
    public void deveClassificarComoEscaleno() {
        Triangulo t = new Triangulo(3, 4, 5);
        assertTrue(t.formaTriangulo());
        assertEquals(TrianguloTipo.escaleno, t.determinarTipo());
    }

    @Test
    public void deveClassificarComoIsoscelesLados1e2() {
        Triangulo t = new Triangulo(5, 5, 3);
        assertTrue(t.formaTriangulo());
        assertEquals(TrianguloTipo.isosceles, t.determinarTipo());
    }

    @Test
    public void deveClassificarComoIsoscelesLados1e3() {
        Triangulo t = new Triangulo(5, 3, 5);
        assertTrue(t.formaTriangulo());
        assertEquals(TrianguloTipo.isosceles, t.determinarTipo());
    }

    @Test
    public void deveClassificarComoIsoscelesLados2e3() {
        Triangulo t = new Triangulo(3, 5, 5);
        assertTrue(t.formaTriangulo());
        assertEquals(TrianguloTipo.isosceles, t.determinarTipo());
    }

    @Test
    public void deveClassificarComoEquilatero() {
        Triangulo t = new Triangulo(4, 4, 4);
        assertTrue(t.formaTriangulo());
        assertEquals(TrianguloTipo.equilatero, t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloComLadoZero() {
        Triangulo t = new Triangulo(0, 4, 4);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloComLadoNegativo() {
        Triangulo t = new Triangulo(-1, 4, 4);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloSomaDoisLadosIgualAoTerceiro1() {
        Triangulo t = new Triangulo(2, 3, 5);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloSomaDoisLadosIgualAoTerceiro2() {
        Triangulo t = new Triangulo(3, 5, 2);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloSomaDoisLadosIgualAoTerceiro3() {
        Triangulo t = new Triangulo(5, 2, 3);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloSomaDoisLadosMenorQueTerceiro1() {
        Triangulo t = new Triangulo(2, 2, 5);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloSomaDoisLadosMenorQueTerceiro2() {
        Triangulo t = new Triangulo(5, 2, 2);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloSomaDoisLadosMenorQueTerceiro3() {
        Triangulo t = new Triangulo(2, 5, 2);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloComTodosLadosZero() {
        Triangulo t = new Triangulo(0, 0, 0);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloComSegundoLadoZero() {
        Triangulo t = new Triangulo(4, 0, 4);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

    @Test
    public void naoFormaTrianguloComTerceiroLadoZero() {
        Triangulo t = new Triangulo(4, 4, 0);
        assertFalse(t.formaTriangulo());
        assertNull(t.determinarTipo());
    }

}
