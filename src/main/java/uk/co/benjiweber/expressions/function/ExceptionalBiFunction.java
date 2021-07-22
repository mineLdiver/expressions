package uk.co.benjiweber.expressions.function;

public interface ExceptionalBiFunction<A, B, R, E extends Exception> {
    R apply(A a, B b) throws E;
}
