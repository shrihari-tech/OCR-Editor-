import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Somthing");
        String data;
        data=sc.next();
        System.out.println("You Entered "+data);
        System.out.println("Enter Some Number");
        int Number=sc.nextInt();
        System.out.println("The Entered Number is "+Number);
        System.out.println("Enter Line Statement");
        String line=sc.nextLine();
        System.out.println("The Entered Line is "+line);
    }
}