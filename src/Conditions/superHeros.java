//switch case

package Conditions;

public class superHeros {

    String heroName="Spider man";

    public void listOfheroNames(){

        switch (heroName){
            case "Spider man":
                System.out.println("Spider man is your super Hero");
                break;
            case "Bat man":
                System.out.println("Bat man is your super Hero");
                break;
            case "Fire man":
                System.out.println("Fire man is your super Hero");
                break;
            default:
                System.out.println("Sorry i cant guess");
        }
    }
    public static void main(String [] args){
        superHeros Hero = new superHeros();
        Hero.listOfheroNames();
    }


}
