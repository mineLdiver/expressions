package uk.co.benjiweber.expressions.function;

public interface QuinFunction<A, B, C, D, E, R> {
    R apply(A a, B b, C c, D d, E e);
}
