package com.thiru.learn.datastructures.lists;

import java.util.Objects;
import java.util.function.Consumer;

public class LinkedList<T> implements OrderedList<T>{
	private Node<T> head; 

	@Override
	public void forEach(Consumer<T> consumer) {
		Node<T> tmp = head;
		while(tmp!=null) {
			consumer.accept(tmp.data);
			tmp = tmp.next;
		}
	}
	@Override
	public boolean addAfter(T oldData, T newData) {
		Node<T> cur = head;
		boolean added = false;
		while(cur!=null && !Objects.equals(cur.data, oldData)) {
			cur = cur.next;
		}
		//if list is empty - very first time
		if(isEmpty()) {
			head = new Node<>();
			head.data = newData;
			head.next = null;
			added = true;
		}else if(cur!=null && Objects.equals(cur.data, oldData)) {
			//if node to insert after found
			Node<T> newNode = new Node<>();
			newNode.data = newData;
			newNode.next = cur.next;
			cur.next = newNode;
			added = true;
		}
		return added;
		
	}
	@Override
	public boolean addBefore(T oldData, T newData) {
		if(isEmpty()) {
			head = new Node<T>();
			head.data = newData;
			head.next = null;
		}else {
			//list is not empty
			Node<T> cur = head;
			while(cur.next!=null && !Objects.equals(cur.next.data, oldData)) {
				cur = cur.next;
			}
			
			//if(cur!=null)
		}
		return false;
	}

	@Override
	public boolean remove(T data) {
		if(head!=null && Objects.equals(head.data,data)) {
			head = head.next;
		}else {
			Node<T> cur = head;
			Node<T> prev = null;
			while(cur!=null && !Objects.equals(cur.data, data)) {
				prev = cur;
				cur = cur.next;
			}
			if(cur!=null && Objects.equals(cur.data, data)) {
				prev.next = cur.next;
			}else {
				System.out.printf("%d not found%n",data);
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public boolean contains(T data) {
		Node<T> current = head;
		while(current!=null) {
			if(Objects.equals(current.data, data)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public void add(T data) {
		addAfter(null, data);
	}

}
