//If-else-IF

package Conditions;

public class myHeroGuess {

    String myheroName = "Super Man";

    public void guessMyhero(){

        if (myheroName.equals("Super Man")){
            System.out.println("I got it, its Super man !");
        }else if (myheroName.equals("Bat Man")){
            System.out.println("I got it, its Bat man !");
        } else if (myheroName.equals("Spider Man")) {
            System.out.println("I got it, its Spider man !");
        }else {
            System.out.println("Sorry i cant guess!!!");
        }

    }
    public static void main(String [] args){
        myHeroGuess Hero = new myHeroGuess();
        Hero.guessMyhero();
    }

}
