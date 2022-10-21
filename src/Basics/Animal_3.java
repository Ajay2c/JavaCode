//Parameterized Constructor

package Basics;

public class Animal_3 {

    String animal_name;
    String animal_type;

    Animal_3(String name, String type){
        animal_name = name;
        animal_type = type;
    }
    public void sayAnimalname(){
        System.out.println("The animal name is " + animal_name + " the type is " + animal_type);

    }
    public static void main(String [] args){
        Animal_3 animal1 = new Animal_3("Duck", "Ominivores");
        animal1.sayAnimalname();
        Animal_3 animal2 = new Animal_3("Lion","Ominivores");
        animal2.sayAnimalname();
    }

}
