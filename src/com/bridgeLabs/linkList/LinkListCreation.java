package com.bridgeLabs.linkList;

public class LinkListCreation<N> {
	//creating pointer/ref to the first node
	OneNode head;
	public void addANode(OneNode node,OneNode afterNode) {
		OneNode temp = afterNode.next;
		if(temp==null) {
			afterNode.next=node;
		}
		else {
			afterNode.next=node;
			node.next=temp;
		}
	}
	public void addANode(OneNode node ) {
	//if the given node is the first element 
		if(this.head==null) {
		this.head=node;
	}
		//if given element is not the first element
	else {
		//temp var to store temperorly the head 
		OneNode temp=head;
		// till  node next is node we are accessing the last element  
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
		}
	 
 }

}