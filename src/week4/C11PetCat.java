/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author jten10
 */
public class C11PetCat extends C11Pet {
    @Override
    public String speak() {
        return "meow";
    }
    
    @Override
    public String toString() {
        return "I, " + getPetName() + ", am a cat";
    }
    
}
