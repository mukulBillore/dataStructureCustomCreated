package com.bridgelab.binarySearchTree;

public class BinarySearchTreeCreation{
		BSTNode root ;
		public void insert(int key) {
			
			root=insertRec(root,key);
		}
		BSTNode insertRec(BSTNode root,int key) {
			if(root == null) {
				root=new BSTNode(key);
				return root;
			}
			if(key < root.key) 
				root.left = insertRec(root.left,key);
			
			else if(key > root.key) 
				root.right = insertRec(root.right,key);
				return root;
			
			
		}
		public void print() {
			printRec(root);
		}
		void printRec(BSTNode root) {
			if(root != null) {
				printRec(root.left);
				System.out.println(root.key);
				printRec(root.right);
			}
		}

		public void searchBST(int i) {
			int counter = 0;
			BSTNode temp=root;
			if(temp != null) {
				while(temp.key < i) {
					System.out.println(temp.key);
					temp = temp.left;
				}
				if(root.key == i) 
					counter++;
					while(temp.key > i) {
						temp = temp.left;
					}
					if(temp.key == i) {
						counter++;
					}
					if(counter > 0) {
						System.out.println(true);
					}
					else {
						System.out.println(false);
					}
				}
				
			}
		

}
