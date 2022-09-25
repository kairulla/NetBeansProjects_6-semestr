/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg1.pkg3.pkg1;

/**
 *
 * @author fedora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char s[] = {'J', 'a', 'v', 'a'};
        String str = new String(s);
        if (!str.isEmpty()) {
            int i = str.length();
            str = str.toUpperCase();
            String num = String.valueOf(6);
            num = str.concat("-" + num);
            char ch = str.charAt(2);
            i = str.lastIndexOf('A');
            num = num.replace("6", "SE");
            str.substring(0, 4).toLowerCase();
            str = num + "-6";
            String[] arr = str.split("-");
            for (String ss : arr) {
                System.out.println(ss);
            }
        } else {
            System.out.println("String is empty!");
        }
    }

}
