package uk.co.benjiweber.expressions.function;

public interface ExceptionalQuadConsumer<T,U,V,W,E extends Exception> {
    void accept(T t, U u, V v, W w) throws E;
}
