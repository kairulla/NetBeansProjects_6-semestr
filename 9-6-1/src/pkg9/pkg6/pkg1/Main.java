/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg6.pkg1;

import java.util.prefs.Preferences;
import java.util.Arrays;

/**
 *
 * @author fedora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Preferences node = Preferences.userRoot().node("tsn_demo");
        Preferences node2 = Preferences.userRoot().node("tsn_demo").node("person");
        //Preferences node = Preferences.systemRoot().node("tsn_demo");
        //Preferences node2 = Preferences.systemRoot().node("tsn_demo").node("person");

        byte k[] = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        
        node.put("fio", "Talipov Sergey N.");
        node.putInt("age", 38);
        node2.putFloat("weight", 70.51f);
        node2.putBoolean("men", true);
        node2.putByteArray("num", k);
        String s = node.get("fio", "???");
        int n = node.getInt("age", 0);
        float f = node2.getFloat("weight", 0);
        boolean b = node2.getBoolean("men", true);
        byte[] kk = node2.getByteArray("num", null);
        String s2 = Arrays.toString(kk);
        System.out.println(s + " - " + n);
        System.out.println(f + " - " + b);
        System.out.println(s2);        
    }
}
