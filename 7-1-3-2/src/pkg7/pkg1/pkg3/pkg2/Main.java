/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg1.pkg3.pkg2;

/**
 *
 * @author fedora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println(s1 + "==" + s2 + ":" + (s1 == s2));
        System.out.println(s1 + "==" + s3 + ":" + (s1 == s3));
        System.out.println(s1 + "equals" + s2 + ":" + s1.equals(s2));
        System.out.println(s1 + "equals" + s3 + ":" + s1.equals(s3));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }    
}
