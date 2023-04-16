abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Draw Rectange");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Draw Square");
    }
}

class Main{
    public static void main(String[] args){
        //Rectangle r=new Rectangle();
       // Square s = new Square();
       Shape obj=new Square();
       obj.draw();
       // r.draw();
       // s.draw();
    }
}