package uk.co.benjiweber.expressions.function;

public interface VarFunction<T, R> {

    @SuppressWarnings("unchecked")
    R apply(T... t);
}
