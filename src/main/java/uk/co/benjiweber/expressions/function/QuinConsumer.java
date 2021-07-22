package uk.co.benjiweber.expressions.function;

public interface QuinConsumer<T,U,V,W,X> {
    void accept(T t, U u, V v, W w, X x);
}
