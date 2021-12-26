package com.bridgeLabs.queue;

import com.bridgeLabs.linkList.LinkListCreation;
import com.bridgeLabs.linkList.OneNode;

public class QueueCreation {
	LinkListCreation queue;

	public void enQueue(OneNode node) {
		queue.addANode(node);

	}
	public void deQueue() {
		queue.pop();
	}
}
