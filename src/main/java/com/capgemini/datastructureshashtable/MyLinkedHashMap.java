package com.capgemini.datastructureshashtable;
import java.util.*;

public class MyLinkedHashMap<K,V> {
	private final int numBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;
	
	public MyLinkedHashMap() {
		this.numBuckets=10;
		this.myBucketArray=new ArrayList<>(numBuckets);
		for(int i=0;i<numBuckets;i++)
			myBucketArray.add(null);
	}
	
	public int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}
	public V get(K key) {
		int index=this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList=myBucketArray.get(index);
		if(myLinkedList==null)
			return null;
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>)myLinkedList.search(key);
		if(myMapNode!=null)
			return myMapNode.getValue();
		else return null;
		
		
	}
	public void add(K key,V value) {
		int index=this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList=this.myBucketArray.get(index);
		if(myLinkedList==null) {
			myLinkedList=new MyLinkedList<>();
			MyMapNode myMapNode=new MyMapNode(key,value);
			myLinkedList.append(myMapNode);
			this.myBucketArray.set(index, myLinkedList);
		
		}
		else {
			MyMapNode myMapNode=(MyMapNode) myLinkedList.search(key);
			if(myMapNode==null) {
				myMapNode=new MyMapNode(key,value);
				myLinkedList.append(myMapNode);
			}
			else {
				myMapNode.setValue(value);
			}
			
		}
	}
	public K remove(K key) {
		int index=this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList=this.myBucketArray.get(index);
		if(myLinkedList==null)
			return null;
		else {
			MyMapNode deletedNode=(MyMapNode)myLinkedList.deleteNodeWithKey(key);
			return (K)deletedNode.getKey();
		}
	}
	
}
