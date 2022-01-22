import java.awt.*;
import java.io.Console;
import java.nio.file.StandardWatchEventKinds;
import java.security.InvalidKeyException;
import java.util.Scanner;

class Pump {
    String fueltype;
    String payment;
    int liter = 0;
    int amount = 0;
    int rs = 0;
    float fuel=0;
    boolean petrol=false;
    boolean diesel=false;

    public void setPetrol() {
        if (fueltype == "petrol"){
            petrol = true;
            diesel = false;
        }
    }
    public void setDiesel(){
        if(fueltype == "diesel"){
            diesel = true;
            petrol = false;
        }
    }

    public void ispetrol(){
        petrol = true;
        this.petrol=petrol;
        System.out.println("Fuel Type is Petrol:");

    }

    public void isdesel(){
        diesel = true;
        this.diesel=diesel;
        System.out.println("Fuel Type is Diesel:");
    }

    public void setLiter(){
        System.out.println("Enter the Number of Liters:");
        Scanner sc = new Scanner(System.in);
        liter = sc.nextInt();
    }

}
//@Override
class Station extends Pump{
    float petrolTank;
    float dieselTank;

    public Station(int petrolTank,int dieselTank){
        this.petrolTank=petrolTank;
        this.dieselTank=dieselTank;
    }

    public void putpetrol(){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the Liters Count:");
        float availabelPetrol;
        //float availabelDiesel;
        int deliveredas;
        System.out.println("Enter Fuel Type To be Delivered as \n1.Liter \n2.Amount");
        deliveredas = sc.nextInt();
        switch(deliveredas){
            case 1:
                System.out.println("Enter Number of Liters to Delivered:");
                liter = sc.nextInt();
                try{
                    if(liter>this.petrolTank){
                        throw new RuntimeException();
                        //System.out.println("Fuel Delivered:");

                    }
                    availabelPetrol = petrolTank - liter;
                    System.out.println("Petrol "+liter+" Liters Delivered:");
                    petrolTank = availabelPetrol;
                    System.out.println("Availabel Petrol:"+petrolTank+" Liters");

                }
                catch (RuntimeException e){
                    System.out.println("Out of Stock Come Back Later;");
                }
                //System.out.println("Petrol Delivered:");
                break;
            case 2:
                System.out.println("Enter The Amount to Deliver Fuel as Liters:");
                amount = sc.nextInt();
                fuel = amount/101;
                try{
                    if(fuel>this.petrolTank){
                        throw new RuntimeException();
                    }
                    availabelPetrol = petrolTank - fuel;
                    System.out.println("Fuel Delivered:");
                    petrolTank = availabelPetrol;
                }
                catch (RuntimeException e){
                    System.out.println("Out of Stock Come Back Later:");
                }
                break;

        }


    }

    public void putdiesel(){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the Liters Count:");
        //float availabelPetrol;
        float availabelDiesel;
        int deliveredas;
        System.out.println("Enter Fuel Type To be Delivered as \n1.Liter \n2.Amount");
        deliveredas = sc.nextInt();
        switch(deliveredas){
            case 1:
                System.out.println("Enter Number of Liters to Delivered:");
                liter = sc.nextInt();
                try{
                    if(liter>this.dieselTank){
                        throw new RuntimeException();
                        //System.out.println("Fuel Delivered:");

                    }
                    availabelDiesel = dieselTank - liter;
                    System.out.println("Diesel "+liter+" Liters Delivered");
                    dieselTank = availabelDiesel;
                }
                catch (RuntimeException e){
                    System.out.println("Out of Stock Come Back Later;");
                }
                //System.out.println("Petrol Delivered:");
                break;
            case 2:
                System.out.println("Enter The Amount to Deliver Fuel as Liters:");
                amount = sc.nextInt();
                fuel = amount/93;
                try{
                    if(fuel>this.dieselTank){
                        throw new RuntimeException();
                    }
                    availabelDiesel = dieselTank - fuel;
                    System.out.println("Fuel Delivered:"+fuel);
                    dieselTank = availabelDiesel;
                }
                catch (RuntimeException e){
                    System.out.println("Out of Stock Come Back Later:");
                }
                break;

        }

    }

}

class Admin extends Station{
    private int password;
    public Admin(int petrolTank, int dieselTank,int password) {
        super(petrolTank, dieselTank);
    }

    public void checkpetrol(int password){
        Console console = System. console();
        System.out.println("Enter the Password:");
        //System. out. print("Enter your password: ");
        char[] Password = console. readPassword();
        String data = new String(Password);
        int key = Integer.parseInt(data);
        //TextField Password = new TextField();
        //Password.setEchoChar('*');
        Scanner sc = new Scanner(System.in);
        //int key = sc.nextInt();
        try {
            if (key != password) {
                //System.out.println("Availabel Petrol:" + petrolTank);
                throw new InvalidKeyException();
            }
            System.out.println("Availabel Petrol:" + petrolTank);
        }
        catch (InvalidKeyException e){
            for(int i=3;i>=1;i--) {
                System.out.println("Invalid Pin \n Try Again you have " +i+" Chances:");
                Scanner pass = new Scanner(System.in);
                System.out.println("Enter Correct Pin:");
                Console cmd = System. console();
                char[] pin = console.readPassword();
                String pinnum = new String(pin);
                int newPassword = Integer.parseInt(pinnum);
                //key = newPassword;
                //to check th Password Exception and the re entry of the new Password

            }

        }



    }
}


class Main {
    public static void main(String[] args) {
        Pump pump = new Pump();
        Station station = new Station(5,22000);
        Admin admin = new Admin(5,22000,7598);
        Scanner sc = new Scanner (System.in);
        int fuel;
        System.out.println("Enter fuel Type \n1.petrol \n2.Dieseln\n3.Admin:");
        fuel = sc.nextInt();

        switch(fuel){
            case 1:
                pump.ispetrol();
                station.putpetrol();
                break;
            case 2:
                pump.isdesel();
                station.putdiesel();
                break;
            case 3:
                admin.checkpetrol(7598);

        }
    }

}

// to check put petrol method and to corrct invalid pin correction - Declared as error to be Corrected

