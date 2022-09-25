/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15.pkg1.pkg3.pkg3;

/**
 *
 * @author fedora
 */
public class BigDog extends Dog {
    
    int weight;
    
    BigDog() {
        name = "BigDog";
        year = 5;
        weight = 10;
    }
    
    BigDog(String n, int y, int w) {
        super(n, y);
        weight = w;
    }
    
    void dog_aging() {
        name = "Dog_big_old";
        year = 14;
    }
    
    void yip() {
        System.out.println("yip-yip-yip");
    }
    
}
