package hometask8;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by MacUser on 13.03.19.
 */
public class Stack {
    private Object[] array = new Object[5];
    private  int count = 0;
    private BlackList blackList;

    public Stack() {
    }

    public Stack(BlackList blackList) {
        this.blackList = blackList;
    }

    public void push(Object obj){
        if(blackList == null || !blackList.checkBlackList(obj)) {
            if (count != array.length) {
                array[count++] = obj;
                System.out.println("Push object [" + obj + "] to stack.");
            } else {
                System.out.println("Can't push [" + obj + "]. Stack is full already!");
            }
        } else System.out.println("Error: class of the object you are adding is blacklisted.");
    }

    public void pop(){
      if(count != 0)  System.out.println("Object [" + array[--count] + "] was deleted from stack");
    }

    public Object peek(){
        return (count != 0) ? array[count - 1] : null;
    }

    @Override
    public String toString() {
        Object[] helpArray;
        helpArray = Arrays.copyOfRange(array, 0, count);
        return "Stack" + Arrays.toString(helpArray);
    }
}
