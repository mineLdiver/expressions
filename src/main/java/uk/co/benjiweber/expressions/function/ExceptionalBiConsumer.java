package uk.co.benjiweber.expressions.function;

public interface ExceptionalBiConsumer<A, B, E extends Exception> {
    void accept(A a, B b) throws E;
}
