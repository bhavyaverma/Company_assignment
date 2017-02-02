package com.stack.implementation;
import java.lang.Exception;

/**
 * Created by bhavyaverma on 1/27/17.
 */
public class StackImplementation {

    private int size;
    private int SArray[];
    private static int top = -1;

    public StackImplementation(int size)
    {
        this.size = size;
        SArray = new int [size];
    }




    public int peek()
    {
        return SArray[top];
    }

    public void push(int i) throws Exception
    {
        if(top == size-1) {
            throw new Exception("Stack Over");
        }
        else {
            System.out.println("Inserting element : " + i);
            SArray[++top] = i;
        }
    }

    public int pop() throws Exception
    {
        if(top == -1)
        {
            throw new Exception("Stack Under");

        }
        else
        {
            int reuslt = SArray[top--];
            System.out.println("Returning element : " + reuslt);
            return reuslt;
        }
    }

    public static void main(String[] args) {
        StackImplementation st = new StackImplementation(5);
        try {
            st.push(1);
            st.push(20);
            st.push(3);
            //st.pop();
            st.push(40);
            //st.pop();
            //st.push(28);
            //st.push(44);
            //st.push(67);
            st.push(78);
            st.push(78);
            //st.pop();
            //st.pop();
            //st.pop();
            //st.pop();
            st.pop();
            st.push(56);
            st.push(77);
            st.push(12);
            st.push(90);
            st.push(77);
            st.push(88);
            st.push(66);
            st.pop();


        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }


    }
}