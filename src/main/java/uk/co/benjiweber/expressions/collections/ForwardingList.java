package uk.co.benjiweber.expressions.collections;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public interface ForwardingList<E> extends List<E> {
    List<E> delegate();

    @Override
    default int size() {
        return delegate().size();
    }

    @Override
    default Spliterator<E> spliterator() {
        return delegate().spliterator();
    }

    @Override
    default ListIterator<E> listIterator() {
        return delegate().listIterator();
    }

    @Override
    default List<E> subList(int fromIndex, int toIndex) {
        return delegate().subList(fromIndex, toIndex);
    }

    @Override
    default boolean removeAll(Collection<?> c) {
        return delegate().removeAll(c);
    }

    @Override
    default int lastIndexOf(Object o) {
        return delegate().lastIndexOf(o);
    }

    @Override
    default E remove(int index) {
        return delegate().remove(index);
    }

    @Override
    default Object[] toArray() {
        return delegate().toArray();
    }

    @Override
    default void replaceAll(UnaryOperator<E> operator) {
        delegate().replaceAll(operator);
    }

    @Override
    default E set(int index, E element) {
        return delegate().set(index, element);
    }

    @Override
    default boolean add(E e) {
        return delegate().add(e);
    }

    @Override
    default int indexOf(Object o) {
        return delegate().indexOf(o);
    }

    @Override
    default Iterator<E> iterator() {
        return delegate().iterator();
    }

    @Override
    default boolean containsAll(Collection<?> c) {
        return delegate().containsAll(c);
    }

    @Override
    default void clear() {
        delegate().clear();
    }

    @Override
    default boolean retainAll(Collection<?> c) {
        return delegate().retainAll(c);
    }

    @Override
    default boolean remove(Object o) {
        return delegate().remove(o);
    }

    @Override
    default boolean removeIf(Predicate<? super E> filter) {
        return delegate().removeIf(filter);
    }

    @Override
    default ListIterator<E> listIterator(int index) {
        return delegate().listIterator(index);
    }

    @Override
    default void sort(Comparator<? super E> c) {
        delegate().sort(c);
    }

    @Override
    default boolean addAll(int index, Collection<? extends E> c) {
        return delegate().addAll(index, c);
    }

    @Override
    default boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override
    default void forEach(Consumer<? super E> action) {
        delegate().forEach(action);
    }

    @Override
    default <T> T[] toArray(T[] a) {
        return delegate().toArray(a);
    }

    @Override
    default Stream<E> parallelStream() {
        return delegate().parallelStream();
    }

    @Override
    default E get(int index) {
        return delegate().get(index);
    }

    @Override
    default void add(int index, E element) {
        delegate().add(index, element);
    }

    @Override
    default Stream<E> stream() {
        return delegate().stream();
    }

    @Override
    default boolean contains(Object o) {
        return delegate().contains(o);
    }

    @Override
    default boolean addAll(Collection<? extends E> c) {
        return delegate().addAll(c);
    }

    /** @noinspection EqualsWhichDoesntCheckParameterClass*/
    @Override
    default boolean equals(Object o) {
        return delegate().equals(o);
    }

    @Override
    default int hashCode() {
        return delegate().hashCode();
    }
}
