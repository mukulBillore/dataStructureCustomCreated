package com.bridgeLabs.queue;

import com.bridgeLabs.linkList.LinkListCreation;
import com.bridgeLabs.linkList.OneNode;

public class QueueCreation {
	LinkListCreation queue;
	public void enqueue(OneNode node) {
		queue.addANode(node);
	}
}
