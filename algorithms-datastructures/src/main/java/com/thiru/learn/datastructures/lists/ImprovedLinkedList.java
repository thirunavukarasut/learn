package com.thiru.learn.datastructures.lists;

import java.util.Objects;
import java.util.function.Consumer;

public class ImprovedLinkedList<T> implements OrderedList<T>{
	private final Node<T> head;
	private final Node<T> tail;
	public ImprovedLinkedList() {
		head = new Node<>();
		tail = new Node<>();
		head.next = tail;
	}
	
	@Override
	public void forEach(Consumer<T> consumer) {
		Node<T> cur = head.next;
		while(cur!=tail) {
			consumer.accept(cur.data);
			cur = cur.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return head.next == tail;
	}

	@Override
	public boolean contains(T data) {
		return findNode(data) != null;
	}

	@Override
	public void add(T data) {
		//adding node to the front of list is O(1) - would behave like stack
		//addAfter(head,data);
		
		
		//adding node after the last node O(N) - keeps the insertion order
		Node<T> cur = head;
		while(cur.next!=tail) {
			cur = cur.next;
		}
		addAfter(cur, data);
		
	}

	@Override
	public boolean remove(T data) {
		Node<T> selectedNode = findNodeBefore(data);
		boolean removed = false;
		if(selectedNode!=null) {
			selectedNode.next = selectedNode.next.next;
			removed = true;
		}
		return removed;
	}

	private Node<T> findNode(T data) {
		Node<T> cur = head.next;
		Node<T> selectedNode = null;
		while(cur!=tail) {
			if(Objects.equals(cur.data, data)) {
				selectedNode = cur;
				break;
			}
			cur = cur.next;
		}
		return selectedNode;
	}
	
	private Node<T> findNodeBefore(T data) {
		Node<T> cur = head;
		Node<T> selectedNode = null;
		while(cur.next!=tail) {
			if(Objects.equals(cur.next.data, data)) {
				selectedNode = cur;
				break;
			}
			cur = cur.next;
		}
		return selectedNode;
	}

	@Override
	public boolean addAfter(T oldData, T newData) {
		Node<T> selectedNode = findNode(oldData);
		return addAfter(selectedNode, newData);
	}

	@Override
	public boolean addBefore(T oldData, T newData) {
		Node<T> selectedNode = findNodeBefore(oldData);
		return addAfter(selectedNode, newData);
	}
	
	private boolean addAfter(Node<T> selectedNode, T data) {
		boolean added = false;
		if(selectedNode!=null) {
			Node<T> newNode = new Node<>();
			newNode.data = data;
			newNode.next = selectedNode.next;
			selectedNode.next = newNode;
			added = true;
		}
		return added;
	}

}
