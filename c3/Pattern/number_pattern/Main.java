class Main{
    public static void main(String[] args){
        int i,j,lines=5;
        for(i=1;i<=lines;i++){
            for(j=lines;1<=j;j--){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }
}