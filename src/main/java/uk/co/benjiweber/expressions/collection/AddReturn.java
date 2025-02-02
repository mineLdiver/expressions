package uk.co.benjiweber.expressions.collection;

public interface AddReturn<E> extends ForwardingList<E> {

    default E addAndReturn(E e) {
        add(e);
        return e;
    }
}
