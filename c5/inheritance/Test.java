class Circle{
    int radius;
    Circle(int r){
        this.radius=r;
    }
    void area(){
        System.out.println(3.14*Math.pow(radius,2));
    }
}

class Circumfrence extends Circle{
    Circumfrence(int radius){
        super(radius);
    }
    void circumfrence(){
        System.out.println(2*3.14*radius);
    }
}

class Test{
    public static void main(String[] args){
        Circumfrence c = new Circumfrence(6);
        c.area();
        c.circumfrence();
    }
}