/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg1.pkg3.pkg4;

/**
 *
 * @author fedora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abcd");
        s.append('e');
        s.delete(1, 2);
        s.insert(1, 'b');
        s.deleteCharAt(2);
        String ans = s.toString();
        System.out.println(ans);
    }    
}
