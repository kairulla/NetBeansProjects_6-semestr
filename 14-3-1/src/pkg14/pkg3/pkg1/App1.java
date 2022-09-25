/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14.pkg3.pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 *
 * @author fedora
 */
public class App1 {
    
    String dir = new File(".").getAbsoluteFile().getParentFile().getAbsolutePath() + System.getProperty("file.separator");
    String FileName = dir + "tsn_demo.xml";
    File f = new File("FileName");
    Properties p = new Properties();
    void writeXML() {
        try {
            if (f.exists() == false) { f.createNewFile(); }
            else { p.loadFromXML(new FileInputStream(FileName)); }
            p.setProperty("fio", "Talipov S.N.");
            p.setProperty("age", "38");
            p.storeToXML(new FileOutputStream(FileName), new Date().toString());            
        } catch (Exception e) {
            System.err.println("Error store to XML!");
        }
    }
    
    void readXML() {
        try {
            p.loadFromXML(new FileInputStream(FileName));
            System.out.println(p.getProperty("fio", "???"));
            System.out.println(p.getProperty("age", "0"));
        } catch (Exception e) {
            System.err.println("Error load from XML!");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App1 MyApp = new App1();
        MyApp.writeXML();
        MyApp.readXML();
    }
    
}
