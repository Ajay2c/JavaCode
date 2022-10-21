package Basics;

public class Draw_5 {
    String draw_object;

    Draw_5(){
        System.out.println("The Object is Empty");
    }

    Draw_5(String toDraw){
        draw_object = toDraw;
        System.out.println("The Draw object is" + toDraw);
    }
    public static void main(String [] args){
        Draw_5 object1 = new Draw_5();
        Draw_5 object2 = new Draw_5("Circle");
    }

}
