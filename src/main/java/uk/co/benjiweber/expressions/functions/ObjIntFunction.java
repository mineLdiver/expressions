package uk.co.benjiweber.expressions.functions;

@FunctionalInterface
public interface ObjIntFunction<T, R> {

    R apply(T obj, int value);
}
