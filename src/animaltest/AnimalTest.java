/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animaltest;

/**
 *
 * @author peter
 */
public class AnimalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.makeNoise();

        Cat myCat = new Cat();
        myCat.eat();
        myCat.makeNoise();

        Horse myHorse = new Horse();
        myHorse.eat();
        myHorse.makeNoise();
    }

}
