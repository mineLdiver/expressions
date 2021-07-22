package uk.co.benjiweber.expressions.collection;

import java.util.List;

import static java.util.Arrays.asList;

public interface EnhancedList<E> extends ForwardingList<E>, WithIndex<E>, AddReturn<E> {

    @SafeVarargs
    static <E> EnhancedList<E> enhancedList(E... values) {
        return enhance(asList(values));
    }

    static <E> EnhancedList<E> enhance(List<E> list) {
        return () -> list;
    }

}
