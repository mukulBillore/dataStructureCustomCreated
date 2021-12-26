package com.bridgelabz.stack;

import com.bridgeLabs.linkList.LinkListCreation;
import com.bridgeLabs.linkList.OneNode;
import com.bridgeLabs.linkList.PrintListFun;

public class StackCreation<N> {
LinkListCreation<N> stack; 

public void push(OneNode newNode) {
	stack.addANode(newNode);;
}
public void printStack() {
	PrintListFun obj = new PrintListFun();
	obj.PrintLinklist(stack);
}

}

