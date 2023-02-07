/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animaltest;

/**
 *
 * @author peter
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Cat Eats");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

}