		package com.bridgelab.binarySearchTree;
public class Utility {
	
		class BSTNode{
			int key ;
			BSTNode left,right;
			
			public BSTNode(int item){
				key=item;
				left=right=null;
			}
			
		}
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
	}

