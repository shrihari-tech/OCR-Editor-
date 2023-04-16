interface Shape{
    void draw();
}

interface Size {
    public void show();
}

/*class Rectangle implements Shape{
    public void draw(){
        System.out.println("Draw Rectange");
    }
}
*/
class Square implements Shape{
    public void draw(){
        System.out.println("Draw Square");
    }
}

class Main implements Shape,Size{
    public void draw(){
        System.out.println("Drwaing");
    }
    public void show(){
        System.out.println("Showing");
    }
    public static void main(String[] args){
        //Rectangle r=new Rectangle();
        Square s = new Square();
        Shape obj=new Square();
        obj.draw();
       //obj.draw();
        //r.draw();
        //s.draw();
       
    }
}