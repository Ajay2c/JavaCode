package Basics;

public class LoanAmount_2 {
    Integer collectAmount = 633;
    public Integer collectMyamount(){
        System.out.println("Daddy have to collect " + collectAmount + "and sent it to you");
        return collectAmount;
    }
    public static void main(String [] args){
        LoanAmount_2 mySon = new LoanAmount_2();
        Integer amount = mySon.collectMyamount();
        System.out.println("Got the amount son " + amount);
    }
}
