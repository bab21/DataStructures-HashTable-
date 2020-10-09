package com.capgemini.datastructureshashtable;

public class MyHashMap<K,V> {
	MyLinkedList<K> myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList=new MyLinkedList<>();
	}
	
	public V get(K key) {
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>)this.myLinkedList.search(key);
		
		
		if(myMapNode==null)
			return null;
		else
			return myMapNode.getValue();	
	}
	public void add(K key,V value) {
		
		MyMapNode myMapNode=(MyMapNode<K,V>)this.myLinkedList.search(key);
		if(myMapNode==null) {
			myMapNode=new MyMapNode(key,value);
			this.myLinkedList.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
		
	}
	public void printHashMap() {
		this.myLinkedList.printMyLinkedList();
	}
	public int getSize() {
		return this.myLinkedList.size();
	}
}
