import java.util.*;
class Main{
    public static void main(String[] args){
    int sum=0;
    Scanner sc= new Scanner(System.in);
    int no=sc.nextInt();
    while(no>0){
        int rem=no%10;
        if(rem%2!=0){
            sum=sum+rem;
        }
        no=no/10;
    }
    System.out.println(sum);
    }
}