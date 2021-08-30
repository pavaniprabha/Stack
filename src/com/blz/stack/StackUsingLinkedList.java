package com.blz.stack;

import java.util.EmptyStackException;

public class StackUsingLinkedList {
        Node top;
        int size;

 class Node {
	 int data;
	 Node next;
	 public Node(int data) {
		 this.data=data;
		 this.next=null;
	 }
 }
 public void push(int data) {
	Node newNode = new Node(data);
	newNode.next = top;
	top = newNode;
	size++;
 }
 public void pop() {
	if(size == 0) {
		throw new EmptyStackException();
	}
		int result = top.data;
		top = top.next;
		size--;
 }
 public int peek()  throws Exception{
	 if(top == null) {
		 System.out.println("stack is empty");
		 throw new Exception("stack is empty");
	 }
	     return top.data;
	 }
 
public boolean isEmpty() {
	return size == 0;
}
public int size() {
	return size;
	}
public void display() {
	if(top == null) {
		System.out.println("stack is empty");
	}else {
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.data +" ");
		temp = temp.next;
		}
	}
}

  public static void main(String[] args) throws Exception {
     StackUsingLinkedList obj = new StackUsingLinkedList();
  
     System.out.println(obj.isEmpty());
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.push(70);
        obj.pop();
        obj.pop();
//        obj.display();
        int data = obj.peek();
        System.out.println(data);
        System.out.println(obj.size());
  
  
  
  
  }

}






