package com.stack.implementation;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public class LinkedListImplementation {
    Node head;
     class Node
     {
         int data;
         Node next;
            Node(int data)
            {
                this.data = data;
                next = null;
            }
     }

     public void insert(int n)
     {
         Node n1 = new Node(n);
         n1.next = head;
         head = n1;

     }


    public void show()
    {
        Node display = head;
        while(display != null)
        {
            System.out.println(display.data);
            display=display.next;
        }
    }

    public void middleElement()
    {
        Node l = head;
        Node h = head;
        if(head != null)
        {
            while(h != null &&  h.next != null) {
                h = h.next.next;
                l = l.next;
            }

        }
        System.out.println("Middle element is " + l.data);
    }

    public static void main(String[] args) {
        LinkedListImplementation link = new LinkedListImplementation();
        for(int i=0; i<5; i++)
        link.insert(i);
        link.show();
        link.middleElement();
    }


}
