import java.util.*;

class Main{
    public static void main(String[] args){
        LinkedList <String>a = new LinkedList<String>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        Iterator <String>i= a.iterator();
        a.remove(2);
        System.out.println("Removed lis"+a);
        Integer n=a.get(2);
        System.out.println("Index Value"+n);
        System.out.println("Before sort");
        System.out.println(a);
        LinkedList.sort(a);
        System.out.println("After srting");
        System.out.println(a);
    }
}