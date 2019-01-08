package com.javabrains.exercise_one;

@FunctionalInterface
public interface Condition<T> {
	boolean test(T t);
}
