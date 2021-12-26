package com.bridgeLabs.linkList;

public class MyMainClass<N> {

	public static void main(String[] args) {
		//uc1
		//object to create the node
		OneNode node1 = new OneNode(56);
		OneNode node2 = new OneNode(30);
		OneNode node3 = new OneNode(70);
		//objects to create linklist
		LinkListCreation<OneNode> list1 = new LinkListCreation<OneNode>();
		//object to print the linkList 
		PrintListFun print = new PrintListFun();
		list1.addANode(node1);
		list1.addANode(node2);
		list1.addANode(node3);
		//print.PrintLinklist(list1);
		//uc4
		OneNode nodea = new OneNode(30);
		OneNode nodeb = new OneNode(56);
		OneNode nodec = new OneNode(70);
		LinkListCreation<OneNode> list2 = new LinkListCreation<OneNode>();
		list2.addANode(nodea);
		list2.addANode(nodeb);
		//uc4 add after a node
		list2.addANode(nodec , nodea);
		list2.pop();
		print.PrintLinklist(list2);
		
	}

}
