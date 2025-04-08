package com.example.TDDPractice.ex1;

public class Triangulo {
    private int ladoA, ladoB, ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public boolean formaTriangulo() {
        return ladoA > 0 && ladoB > 0 && ladoC > 0 &&
                ladoA + ladoB > ladoC &&
                ladoA + ladoC > ladoB &&
                ladoB + ladoC > ladoA;
    }

    public TrianguloTipo determinarTipo() {
        if (!formaTriangulo()) {
            return null;
        }

        if (ladoA == ladoB && ladoB == ladoC) {
            return TrianguloTipo.equilatero;
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return TrianguloTipo.isosceles;
        } else {
            return TrianguloTipo.escaleno;
        }
    }

}
