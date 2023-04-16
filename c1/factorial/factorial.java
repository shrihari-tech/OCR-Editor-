package factorial;
import java.util.*;
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number:");
        int number=0;
        int result=0;
        number=sc.nextInt();
        for(int i=1;i<=number;i++){
            number=number*i;
            result=number;
        }
        System.out.println(result);
    }
}
