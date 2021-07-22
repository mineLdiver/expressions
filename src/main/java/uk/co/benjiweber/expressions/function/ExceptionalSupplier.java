package uk.co.benjiweber.expressions.function;

public interface ExceptionalSupplier<T, E extends Exception> {
    T supply() throws E;
}
