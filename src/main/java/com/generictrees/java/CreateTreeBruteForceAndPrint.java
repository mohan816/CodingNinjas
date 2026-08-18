package com.generictrees.java;

/*
 *        1
 *     2  3  4
 *       5 6 
 *  Create above tree structure and print it.
 */

public class CreateTreeBruteForceAndPrint {
	
	/*
	 * 1) The idea is just create all the nodes of the generic tree
	 * 2) Then add the created nodes to the respective parents, refer the above tree structure.
	 */
	
	public static GenericTree<Integer> createTree() {
		GenericTree<Integer> root = new GenericTree<Integer>(1);
		GenericTree<Integer> rootChild1 = new GenericTree<Integer>(2);
		GenericTree<Integer> rootChild2 = new GenericTree<Integer>(3);
		GenericTree<Integer> rootChild3 = new GenericTree<Integer>(4);
		GenericTree<Integer> rootChild2Child1 = new GenericTree<Integer>(5);
		GenericTree<Integer> rootChild2Child2 = new GenericTree<Integer>(6);
		root.children.add(rootChild1);
		root.children.add(rootChild2);
		root.children.add(rootChild3);
		rootChild2.children.add(rootChild2Child1);
		rootChild2.children.add(rootChild2Child2);	
		return root;
		
	}
	
	/*
	 * In the below function explicitly we didn't mention the base condition. But it is handled automatically in the below code.
	 * 
	 */
	public static void printBruteForce(GenericTree<Integer> root) {
		System.out.print(root.data + " ");
		for(int i = 0; i < root.children.size(); i++)
			printBruteForce(root.children.get(i));
	}
	
	public static void printGenericTreeOptimized(GenericTree<Integer> root) {
		//special case
		if(root == null)
			return;
		System.out.print(root.data + ": ");
		for(int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data+" ");
		}
		System.out.println();
		for(int i = 0; i < root.children.size(); i++) {
			printGenericTreeOptimized(root.children.get(i));
		}
	}
	
	public static void main(String[] args) {
		GenericTree<Integer> root = createTree();
		printBruteForce(root);
	}

}
