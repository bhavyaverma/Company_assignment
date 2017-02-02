package com.stack.implementation;
import java.lang.Exception;

/**
 * Created by bhavyaverma on 1/28/17.
 */
public class QueueImplementation {
    public int Q[];
    public int front, rear, size;


    public QueueImplementation(int size) {
        this.size = size;
        Q = new int[size];
        front = -1;
        rear = -1;




    }

    /*public int peek() throws Exception
    {
        if (front == -1)
        {
            throw new Exception("Underflow");
        }
        return Q[front];
    }*/

    public void insert(int i) throws Exception
    {
        if (rear == -1)
        {
            front = 0;
            rear = 0;
            Q[rear] = i;
        }
         if (rear + 1 >= size)
        {
            throw new Exception("Overflow");
        }
        else if (rear + 1 < size)
        {
            Q[++rear] = i;

        }
    }

    public int delete() throws Exception
    {
        if (front == -1)
        {
           throw new Exception("Underflow");
        }
        else
        {

            int ele = Q[front];
            if ( front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
                front++;
            return ele;
        }
    }

    public void display() throws Exception
    {
        for (int i = front; i <= rear; i++)
            System.out.print(Q[i]+" ");
    }

    public static void main(String[] args) {
        QueueImplementation im = new QueueImplementation(7);
        try{

im.insert(20);
im.insert(30);
im.delete();
im.insert(60);
im.display();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }


}