package Basics;

public class defaultConstructors_1 {

    // defaultConstructor{
    //                   default con
    // }

    String student_name;
    Integer rollNo;
    int age;
    public static void main(String [] args){
        defaultConstructors_1 student = new defaultConstructors_1();
        System.out.println(student.rollNo);
        System.out.println(student.student_name);
        System.out.println(student.age);
    }
}
