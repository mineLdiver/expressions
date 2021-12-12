package uk.co.benjiweber.expressions.function;

public interface VarConsumer<T> {

    @SuppressWarnings("unchecked")
    void accept(T... t);
}
