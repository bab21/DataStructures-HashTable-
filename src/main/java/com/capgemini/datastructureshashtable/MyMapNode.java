package com.capgemini.datastructureshashtable;

public class MyMapNode<K,V> implements INode<K> {
	K key;
	V value;
	MyMapNode<K,V> next;
	
	public MyMapNode(K key,V value) {
		this.key=key;
		this.value=value;
		this.next=null;
	}
	@Override
	public K getKey() {
		return this.key;
	}
	public V getValue() {
		return this.value;
	}
	@Override
	public void setKey(K key) {
		this.key=key;
	}
	public void setValue(V value) {
		this.value=value;
	}
	@Override
	public INode<K> getNext(){
		return this.next;
	}
	@Override
	public void setNext(INode next) {
		this.next=(MyMapNode<K,V>)next;
	}
}
