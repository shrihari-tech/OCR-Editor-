class Shape{
    int a,b;
    String s="Shapes area Calculation";
    Shape(int a,int b){
        this.a=a;
        this.b=b;
    }
}

class Square extends Shape{
    Square(int a,int b){
        super(a,b);
    }

    void area(){
        System.out.println(Math.pow(a,2));
        System.out.println(super.s);
    }
}

class Rectangle extends Shape{
    Rectangle(int a,int b){
        super(a,b);
    }

    void area(){
        System.out.println((a*b)/2);
    }
}

class Test{
    public static void main(String[] args){
        Square s= new Square(5,3);
        Rectangle r = new Rectangle(8, 3);
        s.area();
        r.area();
    }
}
