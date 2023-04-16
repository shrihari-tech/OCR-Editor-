//complie time polymorphism => Overrloading
//runtime polymorphism =>Overriding 


class Bank{
    public long acc_no;
    // private String name,email_id;
    // private int amt;

    public Void setValue(long acc){
        acc_no=acc;
        return null;
    }
    public long getValue(){
        return acc_no;
    }
}

class Main{
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.setValue(464646146);
        //bank.getValue();
        System.out.println(bank.getValue());
    }
}