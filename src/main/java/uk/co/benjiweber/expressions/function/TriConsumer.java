package uk.co.benjiweber.expressions.function;

public interface TriConsumer<T,U,V> {
    void accept(T t, U u, V v);
}
