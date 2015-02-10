/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Adam
 */
public class Startup {
    public static void main(String[] args) {
        //Liskov Time
        ProgrammingCourse advJava = new AdvancedJavaCourse();
        ProgrammingCourse introJava = new IntroJavaCourse();
        ProgrammingCourse introProg = new IntroToProgrammingCourse();
        
        advJava.setCourseName("Advanced Java");
        introJava.setCourseName("Introduction to Java");
        introProg.setCourseName("Introduction to Programming");
        
        //Liskov is possible when a class is a direct subclass of another class
        //I believe interfaces are the best way to go regardless of the application because they lay
        //the foundation for the entire heirarchy
    }
}
