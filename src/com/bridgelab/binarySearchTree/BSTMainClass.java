package com.bridgelab.binarySearchTree;

public class BSTMainClass {

	public static void main(String[] args) {

		BinarySearchTreeCreation bst1 = new BinarySearchTreeCreation();
		bst1.insert(56);
		bst1.insert(30);
		bst1.insert(70);
		bst1.insert(22);
		bst1.insert(40);
		bst1.insert(11);
		bst1.insert(3);
		bst1.insert(16);
		bst1.insert(70);
		bst1.insert(60);
		bst1.insert(65);
		bst1.insert(63);
		bst1.insert(67);
		bst1.searchBST(63);
		bst1.print();
	}

}
