package com.bridgeLabs.linkList;
//creating the empty node
public class OneNode <N>{
	 N data;
	OneNode next;
	//Getters and setters for Next of the element 
	public OneNode getNext() {
		return next;
	}
	public void setNext(OneNode next) {
		this.next = next;
		
	}
	//constructor to set the value of the currrent 
	public OneNode(N data) {
		super();
		this.data = data;
		next=null;
	}
	//if we don't want to give the value of the node through constructor
	public OneNode() {}
	

}
