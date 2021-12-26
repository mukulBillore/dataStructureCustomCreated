package com.bridgelabz.stack;

import com.bridgeLabs.linkList.OneNode;
import com.bridgeLabs.linkList.PrintListFun;

public class StackMainClass {

	public static <N> void main(String[] args) {
		// TODO Auto-generated method stub
		PrintListFun obj = new PrintListFun();
		OneNode nodea = new OneNode(56);
		OneNode nodeb = new OneNode(30);
		OneNode nodec = new OneNode(70);
		StackCreation stack1 = new StackCreation();
		stack1.push(nodea);
		stack1.push(nodeb);
		stack1.push(nodec);
		stack1.printStack();
	}

}
