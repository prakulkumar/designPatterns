package com.designPatterns.Behavioural.Iterator;

public interface Iterator<T> {
    boolean hasNext();

    T current();

    void next();
}