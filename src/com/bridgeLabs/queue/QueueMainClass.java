package com.bridgeLabs.queue;

import com.bridgeLabs.linkList.OneNode;

public class QueueMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneNode nodea = new OneNode(56);
		OneNode nodeb = new OneNode(30);
		OneNode nodec = new OneNode(70);
		QueueCreation queue1 = new QueueCreation();
		queue1.enQueue(nodea);
		queue1.enQueue(nodeb);
		queue1.enQueue(nodec);
		queue1.deQueue();
	}

}
