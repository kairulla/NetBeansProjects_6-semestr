/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15.pkg1.pkg1.pkg2;

class MyClass {
    
    public MyClass() {
        System.out.println("This is constructor");
    }
    
    public void MyClass() {
        System.out.println("This is method");
    }
}

/**
 *
 * @author fedora
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.MyClass();
    }
    
}
