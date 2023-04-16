
abstract class Shape{
    int a,b;//Instance Variable

    Shape(int a,int b){
        this.a=a;//this is used to point current pointer value
        this.b=b;
    }
    abstract void area();
    void disp(){
        System.out.println(a+" "+b);
    }
}
class Rectangle extends Shape{
    Rectangle(int a,int b){
        super(a,b); //passing paremeter to parent class from child class
    }
    void area(){
        System.out.println(a*b);
    }
}
class Square extends Shape{
    Square(int a,int b){
        super(a,b);
    }
    void area(){
        System.out.println(a*a);
    }
}

class Triangle extends Shape{
    Triangle(int a,int b){
        super(a,b);
    }
    void area(){
        System.out.println((a*b)/2);
    }
}
class Main{
    public static void main(String[] args){
        Shape r = new Rectangle(6,3);//calling parent by reference of child
        Square s = new Square(5,4);
        Triangle t = new Triangle(8,6);
        t.area();
        s.area();
        r.area();
        r.disp();
    }
}