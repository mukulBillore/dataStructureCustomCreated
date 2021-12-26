package com.bridgeLabs.linkList;

public class PrintListFun {
	//printing the existing link-list
	public void PrintLinklist(LinkListCreation  list) {
	   
		OneNode currentNode =list.head;
	     while(currentNode!=null) {
	    	 System.out.print(currentNode.data+",");
	    	 currentNode=currentNode.next;
	     }System.out.println();
	}

}
