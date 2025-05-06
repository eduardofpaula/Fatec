package br.edu.fatec.sjc;

public interface CalculableStrategy<T extends Number> {
    T calculateValue(T value) throws NullPointerException;
}
