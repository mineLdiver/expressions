package uk.co.benjiweber.expressions.function;

public interface ExceptionalConsumer<A, E extends Exception> {
    void accept(A a) throws E;
}
