package com.capgemini.datastructureshashtable;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList(){
		head=null;
		tail=null;
	}
	
	
	public void add (INode myNode) {
		if(this.tail==null)
			this.tail=myNode;
		if(this.head==null)
			this.head=myNode;
		else {
			INode tempNode=this.head;
			this.head=myNode;
			this.head.setNext(tempNode);
		}
	}
	
	
	public void append(INode myNode) {
		if(this.tail==null)
			this.tail=myNode;
		if(this.head==null)
			this.head=myNode;
		else {
			this.tail.setNext(myNode);
			this.tail=myNode;
		}
		
	}
	
	
	public void insertAfter(INode myNode,INode newNode) {
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	
	public INode pop() {
		if(head==null)
			return null;
		INode tempNode=head;
		head=head.getNext();
		return tempNode;
	}
	
	
	public INode popLast() {
		INode tempNode=head;
		while(tempNode.getNext()!=tail) {
			tempNode=tempNode.getNext();
		}
		INode lastNode=tail;
		this.tail = tempNode;
		tempNode.setNext(null);
		return lastNode;
	}
	
	
	public INode search(K key) {
		INode tempNode=head;
		while(tempNode !=null &&  !tempNode.getKey().equals(key)) {
			tempNode=tempNode.getNext();
		}
		return tempNode;
	}
	
	public int size() {
		int size=0;
		INode tempNode=head;
		while(tempNode!=null) {
			size++;
			tempNode=tempNode.getNext();
		}
		return size;	
	}
	
	public void printMyLinkedList() {
		StringBuffer myNodes=new StringBuffer("My Nodes....");
		INode tempNode=head;
		while(tempNode.getNext()!=null) {
			myNodes.append(tempNode.getKey()+"-->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
		
	}
}
