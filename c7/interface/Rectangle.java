interface Shape{//interface => public static final
    int a=6,b=3;
    void area();//onlye declare not definition in interface
    void disp();//public abstract void by default  
    // static memory is constant only the value is changed
    // final value is constant and memory is also contant
}

class Rectangle implements Shape{
    public void area(){
        System.out.println(a*b);
    }
    public void disp(){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.area();
        r.disp();
    }
}