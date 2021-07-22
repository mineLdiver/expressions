package uk.co.benjiweber.expressions.collection;

import java.util.*;

public interface WithIndex<E> extends ForwardingList<E> {
    interface IndexedItemMapper<T,R> {
        R map(T it, int index);
    }
    interface IndexedItemConsumer<T> {
        void accept(T it, int index);
    }

    default void withIndex(IndexedItemConsumer<E> consumer) {
        for (int i = 0; i < delegate().size(); i++) {
            consumer.accept(delegate().get(i), i);
        }
    }

    default <R> List<R> mapWithIndex(IndexedItemMapper<E,R> mapper) {
        List<R> results = new ArrayList<>();
        for (int i = 0; i < delegate().size(); i++) {
            results.add(mapper.map(delegate().get(i), i));
        }
        return results;
    }
}
