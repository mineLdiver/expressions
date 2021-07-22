package uk.co.benjiweber.expressions.function;

public interface ExceptionalQuadFunction<T,U,V,W,R,E extends Exception> {
    R apply(T t, U u, V v, W w) throws E;
}
