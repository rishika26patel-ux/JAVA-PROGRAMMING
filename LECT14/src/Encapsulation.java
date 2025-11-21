class Atm{
    private int totalbalance=1000000;
    public void gettotalB(){
        System.out.println(totalbalance);
    }
    public void setbalance(int amount){
        if(amount>0 && totalbalance>=amount){
            totalbalance-=amount;
            System.out.println(totalbalance);
        }
    }
}
public class Encapsulation {
    public static void main(String[]args){
        Atm s1=new Atm();
        s1.gettotalB();
        s1.setbalance(4000);
    }
}
