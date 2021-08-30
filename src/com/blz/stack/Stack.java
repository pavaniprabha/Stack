package com.blz.stack;

public class Stack {
	public static int[] myStack = new int[5];
	static int top = -1;
	
     public static void push(int element) {
    	if(isFull()) {
    		 System.out.println("stack is full");
    	 }
    	 else {
    		 top ++;
    		 myStack[top] = element;
    	 }
     
     
     }
     public static  boolean isFull() {
    	 if(top == myStack.length -1)
          return true;
    	 return false;
     }

     public static void displayStackElement() {
    	 if(isEmpty()) {
    		 System.out.println("stack is empty");
    	 }
     
     else {
    	 int temp = top;
    	 while(temp > -1) {
    		 System.out.println("myStack ["+temp+"] = "+myStack[temp]);
                 temp --;    	
    	 }
    	 
     }


}

     public static boolean isEmpty() {
    	 if(top == -1)
          return true;
    	 return false;
     }
     public static void pop() {
    	 if(isEmpty()) {
    		 System.out.println("stack is empty");
    	 }
    	 else
    	 {
    		 System.out.println(myStack[top] + "is popped");
    		 myStack[top] = 0;
    		 top --;
    	 }
     }
     public static void peek() {
    	 if(isEmpty()) {
    		 System.out.println("stack is empty");
    	 }
    	 else
    	 {
    		 System.out.println(myStack[top] + "is top element");
    	 }
    	 
     }
    public static void main(String[] args) {
	   push(23);
	   push(44);
	   push(50);
	   push(59);
	   displayStackElement();
	   pop();
	   push(34);
	   push(56);
	   pop();
	   pop();
	   peek();
	   pop();
	   displayStackElement();
	   push(66);
	   pop();
	   displayStackElement();
	   peek();
	   displayStackElement();
	   System.out.println("-------------------------");
	   push(8);
	   push(78);
	   displayStackElement();
    }
}

