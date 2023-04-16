import java.util.*;

public class calculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number1=0;
        int number2=0;
        int option;
        System.out.println("1.add"+" 2.sub"+" 3.mul"+" 4.div"+" 0.exit");
        System.out.println("Enter the Option");
        option=sc.nextInt();
        while(option!=0){
            switch(option){
                case 1:{
                    System.out.println(number1+number2);
                }
                case 2:{
                    System.out.println(number1-number2);
                }
                case 3:{
                    System.out.println(number1*number2);
                }
                case 4:{
                    System.out.println(number1/number2);
                }
            }
        }
    }
    
}