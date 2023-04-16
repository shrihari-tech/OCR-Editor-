import java.util.*;

class Main{
    public static void main(String[] args){
        LinkedList <String>a = new LinkedList<String>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        Iterator <String>i= a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}