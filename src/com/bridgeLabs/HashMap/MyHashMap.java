package com.bridgeLabs.HashMap;

import com.bridgeLabs.linkList.LinkListCreation;
;
public class MyHashMap<K,V> {
	
	public LinkListCreation LinkListCreation;

	public MyHashMap() {
		this.LinkListCreation = new LinkListCreation<>();
	}

	public V get(K key) {
		MyMapNode<K,V> myMapNode =(MyMapNode<K, V>)this.LinkListCreation.searchElement(key);
		return (myMapNode == null)? null : myMapNode.getValue();
	}
	public void add(K key, V value) {
		MyMapNode<K,V> myMapNode =(MyMapNode<K,V>)this.LinkListCreation.searchElement(key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<>(key ,value);
			this.LinkedListCreation.(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{" +LinkListCreation + '}';
	}

}
