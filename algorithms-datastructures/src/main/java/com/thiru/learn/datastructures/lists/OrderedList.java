package com.thiru.learn.datastructures.lists;

public interface OrderedList<T> extends List<T> {
	boolean addAfter(T oldData, T newData);
	boolean addBefore(T oldData, T newData);
}
