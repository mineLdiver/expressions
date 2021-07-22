package uk.co.benjiweber.expressions.collections;

public interface AddReturn<E> extends ForwardingList<E> {

    default E addAndReturn(E e) {
        add(e);
        return e;
    }
}
