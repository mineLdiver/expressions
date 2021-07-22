package uk.co.benjiweber.expressions.function;

@FunctionalInterface
public interface ObjIntFunction<T, R> {

    R apply(T obj, int value);
}
