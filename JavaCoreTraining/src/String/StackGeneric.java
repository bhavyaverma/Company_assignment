package String;
import java.util.*;

/**
 * Created by bhavyaverma on 2/2/17.
 */
public class StackGeneric<T extends Object> {

    public ArrayList<T> stack = new ArrayList<T> ();
    public int top = -1;
    public int size;


    public StackGeneric(int size)
    {
        this.size = size;

    }



    public void push(T item) throws Exception {
        if (top == size - 1) {
            throw new Exception("Stack Over");
        } else {
            System.out.println("Inserting element : " + item);
            stack.add(++top, item);
        }

    }

    public T pop() throws Exception {
        if (top == -1)

        {
            throw new Exception("Stack Underflow");
        }
        else {
            T result = stack.remove(top--);

            System.out.println("Deleting Elements " + result);
            return result;

        }




    }
    public T peek() throws Exception {
        if (top == size - 1) {
            throw new Exception("Stack Over");
        }
        else {
            T result = stack.get(top);
            System.out.println("Top element is " + result);
            return result;
        }
    }

    public static void main(String[] args) {
        StackGeneric<String> sg = new StackGeneric<String>(5);
        StackGeneric<Integer> sg1 = new StackGeneric<Integer>(6);
        try {
            sg.push("Bhavya");
            sg.push("Anchal");
            sg.push("Kareena");
            sg.pop();
            sg.pop();
            sg.peek();
            sg1.push(6);
            sg1.push(4);
            sg1.pop();
            sg1.peek();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
