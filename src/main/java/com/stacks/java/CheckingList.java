package com.stacks.java;

public class CheckingList {

	public static void main(String[] args) {
		NodeClass<Integer> node1 = new NodeClass<>(10);
		NodeClass<Integer> node2 = new NodeClass<>(20);
		NodeClass<Integer> node3 = new NodeClass<>(30);
		NodeClass<Integer> node4 = new NodeClass<>(40);
		NodeClass<Integer> node5 = new NodeClass<>(50);
		ImplementTheStack<Integer> im = new ImplementTheStack<>();
		im.push(node1);
		im.push(node2);
		im.push(node3);
		im.push(node4);
		im.push(node5);
		System.out.println(im.size());
		System.out.println(im.pop());
		System.out.println(im.size());
		System.out.println(im.isEmpty());
		System.out.println(im.top());

	}

}
