package uk.co.benjiweber.expressions.caseclass;

import java.util.function.Function;

public interface Case3<T,U,V> {
    default MatchBuilderNone<T,U,V> match() {
        return new MatchBuilderNone<T, U, V>() {
            public <R> MatchBuilderOne<T, U, V, R> when(Class<T> clsT, Function<T, R> fT) {
                return (clsU, fU) -> (clsV, fV) -> {
                    if (clsT.isAssignableFrom(Case3.this.getClass())) //noinspection unchecked
                        return fT.apply((T)Case3.this);
                    if (clsU.isAssignableFrom(Case3.this.getClass())) //noinspection unchecked
                        return fU.apply((U)Case3.this);
                    if (clsV.isAssignableFrom(Case3.this.getClass())) //noinspection unchecked
                        return fV.apply((V)Case3.this);

                    throw new IllegalStateException("Match failed");
                };
            }
        };
    }

    interface MatchBuilderNone<T,U,V> {
        <R> MatchBuilderOne<T,U,V,R> when(Class<T> cls, Function<T,R> f);

    }

    interface MatchBuilderOne<T,U,V,R> {
        MatchBuilderTwo<T,U,V,R> when(Class<U> cls, Function<U,R> f);
    }

    interface MatchBuilderTwo<T,U,V,R> {
        R when(Class<V> cls, Function<V,R> f);
    }


    static <T,U extends T> Class<U> erasesTo(Class<T> cls) {
        //noinspection unchecked
        return (Class<U>) cls;
    }
}


