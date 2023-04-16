class Converter{
    int num;
    Converter(int num ){
        this.num=num;
    }
    int toBinary(){
        int str=0;
        int t=num;
        while(t>0){
            t=t/2;
            int rem=t%2;
            //System.out.print(rem);
        }
        return str;
    }

    int toOctal(){
        int octal=0,temp=1,t=num;
        while(t>0){
            int rem=t%8;
            octal+=rem*temp;
            temp=temp*10;
            t=t/8;
            //System.out.print(octal);
        }
        return octal;
    }
    void toHex(){
        int t=num;
        String hex=String.valueOf(t);
        int res=Integer.parseInt(hex, 16);
        System.out.println(res);
    }
}

class Hello{
    public static void main(String[] args){
        Converter obj= new Converter(10);
        System.out.println(obj.toBinary());
       // System.out.print(obj.toOctal());
        //obj.toHex();
    }
}