package uk.co.benjiweber.expressions.function;

public interface ExceptionalQuinFunction<A, B, C, D, E, R, EX extends Exception> {
    R apply(A a, B b, C c, D d, E e) throws EX;
}
