package com.scaler.dsa1.stack;

import com.scaler.dsa1.LinkList.Node;

public class StackUsingLinkList {

    Node head;
    int count =0;

    public void push(int data){
        Node nn=new Node(data);
        nn.next =head;
        head=nn;
        count=count+1;
        System.out.println(data+" : data pushed in stack");
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack isEmpty()");
            return -1;
        }
        int headData=head.data;
        head=head.next;
        count=count-1;
        return headData;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack isEmpty()");
            return -1;
        }
        return head.data;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        return count;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        StackUsingLinkList stackUsingLinkList =new StackUsingLinkList();
        stackUsingLinkList.push(12);
        stackUsingLinkList.push(21);
        stackUsingLinkList.push(31);
        stackUsingLinkList.push(41);
        System.out.println("Top element is: " + stackUsingLinkList.peek());
        System.out.println("Stack Size: "+ stackUsingLinkList.size());
        stackUsingLinkList.display();

        System.out.println(stackUsingLinkList.pop() + " popped from stack");
        stackUsingLinkList.display();

        System.out.println("Top element is: " + stackUsingLinkList.peek());

        System.out.println("Stack Size: "+ stackUsingLinkList.size());
    }
}
