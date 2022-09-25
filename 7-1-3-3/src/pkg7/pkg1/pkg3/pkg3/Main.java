/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg1.pkg3.pkg3;

/**
 *
 * @author fedora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a[] = {"Alena", "Alice", "alina", "albina", "Anastasya", "ALLA", "AnnA"};
        
        for (int j = 0; j < a.length; j++) {
            a[j] = a[j].trim().toLowerCase();            
        }
        
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = j + 1; i < a.length; i++) {
                if (a[i].compareTo(a[j]) < 0) {
                    String temp = a[j]; a[j] = a[i]; a[i] = temp;
                }
            }
        }
        int i = -1;
        while(++i < a.length) { System.out.print(a[i] + " "); }
    }    
}
