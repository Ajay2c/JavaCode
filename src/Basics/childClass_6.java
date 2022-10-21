package Basics;

public class childClass_6 extends parentClass_6 {

    public childClass_6(){
//        super();  - using extends parentClass
        System.out.println("This is Child Constructor");
    }
    public static void main(String [] args) {
        childClass_6 childClass_6 = new childClass_6();
    }
}
