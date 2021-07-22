package uk.co.benjiweber.expressions.function;

public interface QuadFunction<T,U,V,W,R> {
    R apply(T t, U u, V v, W w);
}
