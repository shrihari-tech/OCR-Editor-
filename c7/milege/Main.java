abstract class Vechile{
    int distance,liter;
    Vechile(int distance,int liter){
        this.distance=distance;
        this.liter=liter;
    }

    abstract void milage();

}

class Enfield extends Vechile{
    Enfield(int distance,int liter){
        super(distance,liter);
    }
    void milage(){
        System.out.println(distance/liter);
    }
}

class Honda extends Vechile{
    Honda(int distance,int liter){
        super(distance,liter);
    }
    void milage(){
        System.out.println(distance/liter);
    }
}
class Main{
    public static void main(String[] args){
        Honda d = new Honda(60,1);
        Enfield e = new Enfield(35, 1);
        d.milage();
        e.milage();
    }
}