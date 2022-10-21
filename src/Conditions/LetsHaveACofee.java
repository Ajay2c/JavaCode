//If / Else condition

package Conditions;

public class LetsHaveACofee {

    boolean isCupEmpty = true;
    public static void main(String [] args){

        LetsHaveACofee cofee = new LetsHaveACofee();
        if (cofee.isCupEmpty){
            System.out.println("Filled the Cofee");
        }else{
            System.out.println("The cup is not empty");
        }
    }
}
