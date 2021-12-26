package com.bridgeLabs.linkList;

public class LinkListCreation<N> {
	
	//creating pointer/ref to the first node
	OneNode head;
	//search with particular element
	public void searchElement(N e) {
		OneNode temp=head;
		boolean b = true;
		while(temp.next!=null) {
			if(temp.data==e) {
				System.out.println("The data is found");
				b=false;
				break;
			}
		}if(b==true) {System.out.println("The data is not-found");}
	}
	//delete last node
	public void popLast() {
		if (head == null)
		{}
 
        if (head.next == null) {
            head=null;
        }
 
        // Find the second last node
        OneNode second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;
 
        // Change next of second last
        second_last.next = null;
 
     
    }
			
			
	// delete a first node
	public void pop() {
		OneNode temp=head.next;
		head=temp;
	} 
	//add after certain node
	public void addANode(OneNode node,OneNode afterThisNode) {
		OneNode temp = afterThisNode.next;
		if(temp==null) {
			afterThisNode.next=node;
		}
		else {
			afterThisNode.next=node;
			node.next=temp;
		}
	}
	//add at last node
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