import java.util.*;
public class Main {
    public static void main(String[] args){
        //System.out.println("Hello World");
        Stack <Integer>num = new Stack<Integer>();
        num.push(44);
        num.push(32);
        num.push(32);
        System.out.println("Elements in Stack"+num);
        int remove=num.pop();
        int top = num.peek();
        System.out.println("Element removed "+remove);
        System.out.println("Element in peek is "+top);
    }    
}
