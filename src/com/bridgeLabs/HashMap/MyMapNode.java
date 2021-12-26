package com.bridgeLabs.HashMap;

import com.bridgeLabs.linkList.OneNode;

public class MyMapNode<K, V> {
	K key;
	V value;
	OneNode<K> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	public K getKey() {

		return key;
	}

	public void setKey(K key) {

		this.key = key;
	}

	public OneNode<K> getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "MyMapNode [key=" + key + ", value=" + value + "]";
	}

	public void setValue(V value) {
		this.value = value;
	}

	public void setNext(OneNode<K> next) {
		this.next = (OneNode<K>) next;

	}
}