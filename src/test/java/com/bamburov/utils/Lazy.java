package com.bamburov.utils;

import java.util.function.Supplier;

public class Lazy<T> {
    private T steps;

    Supplier<T> constructorSupplier;

    public Lazy(Supplier<T> constructorSupplier) {
        this.constructorSupplier = constructorSupplier;
    }

    public T getValue() {
        if (steps == null) {
            steps = constructorSupplier.get();
        }
        return steps;
    }
}
