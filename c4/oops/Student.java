public class Student{
    int id;
    String name;
    public void Student(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println(id+" "+name);
    }
    public void display(){
        System.out.println("Hello, World");
    }   
    public static void main(String[] args){
        Student student=new Student();
        student.display();
        student.Student(48,"hari");
    }
}
