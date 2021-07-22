package uk.co.benjiweber.expressions.function;

public interface ExceptionalVoid<E extends Exception> {
    void apply() throws E;
}
