package uk.co.benjiweber.expressions.tuple;

import uk.co.benjiweber.expressions.Value;
import uk.co.benjiweber.expressions.function.ExceptionalBiConsumer;
import uk.co.benjiweber.expressions.function.ExceptionalBiFunction;

public interface BiTuple<A,B> {
    A one();
    B two();
    static <A,B> BiTuple<A,B> of(A a, B b) {
        abstract class BiTupleValue extends Value<BiTuple<A,B>> implements BiTuple<A,B> {}
        return new BiTupleValue() {
            public A one() { return a; }
            public B two() { return b; }
        }.using(BiTuple::one, BiTuple::two);
    }

    default <R, E extends Exception> R map(ExceptionalBiFunction<A, B, R, E> f) throws E {
        return f.apply(one(), two());
    }

    default <E extends Exception> void consume(ExceptionalBiConsumer<A,B,E> consumer) throws E {
        consumer.accept(one(), two());
    }
}
