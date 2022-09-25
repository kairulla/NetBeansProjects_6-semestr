/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15.pkg1.pkg3.pkg2;

/**
 *
 * @author fedora
 */
public class Dog {
    
    final static int max_year = 50;
    protected String name;
    int year;
    static int count = 0;
    private int in_w = 1;
    
    Dog() {
        name = "Dog";
        year = 0;
        count++;
    }
    
    Dog(String n, int y) {
        name = n;
        
        if (y > max_year) {
            year = max_year;
        } else {
            year = y;
        }
        count++;
    }
    
    void dog_aging() {
        name = "Dog_old";
        year = 10;        
    }
    
    void yip() {
        System.out.println("yip");
    }
    
    void setIn_w(int w) {
        in_w = w;
    }
    
    int getIn_w() {
        return in_w;
    }
    
}
