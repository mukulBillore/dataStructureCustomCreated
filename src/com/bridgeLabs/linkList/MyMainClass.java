package com.bridgeLabs.linkList;

public class MyMainClass {

	public static void main(String[] args) {
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
		print.PrintLinklist(list1);
		
	}

}
