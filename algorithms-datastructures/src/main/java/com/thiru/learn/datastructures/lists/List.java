package com.thiru.learn.datastructures.lists;

import java.util.function.Consumer;

public interface List<T> {
	void forEach(Consumer<T> consumer);
	boolean isEmpty();
	boolean contains(T data);
	void add(T data);
	boolean remove(T data);
}
