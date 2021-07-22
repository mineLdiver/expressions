package uk.co.benjiweber.expressions.caseclass;

import java.util.function.Function;

public interface Case2<T,U> {
    default MatchBuilderNone<T,U> match() {
        return new MatchBuilderNone<T, U>() {
            public <R> MatchBuilderOne<U, R> when(Class<T> clsT, Function<T, R> fT) {
                return (clsU, fU) -> {
                    if (clsT.isAssignableFrom(Case2.this.getClass())) //noinspection unchecked
                        return fT.apply((T)Case2.this);
                    if (clsU.isAssignableFrom(Case2.this.getClass())) //noinspection unchecked
                        return fU.apply((U)Case2.this);

                    throw new IllegalStateException("Match failed");
                };
            }
        };
    }

    interface MatchBuilderNone<T,U> {
        <R> MatchBuilderOne<U,R> when(Class<T> cls, Function<T, R> f);

    }

    interface MatchBuilderOne<U,R> {
        R when(Class<U> cls, Function<U, R> f);
    }
}


