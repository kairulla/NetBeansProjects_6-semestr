/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14.pkg2.pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Properties;

class Props {

    String dir = new File(".").getAbsoluteFile().getParentFile().getAbsolutePath() + System.getProperty("file.separator");
    //String dir = System.getProperty("user.home") + System.getProperty("file.separator");
    String FileName = dir + "tsn_demo.prop";
    Properties p = new Properties();

    {
        System.out.println("Каталог с файлом параметров: " + dir);
    }

    public void WriteProps() {
        try {
            File f = new File(FileName);
            if (f.exists() == false) { f.createNewFile(); }
            else p.load(new FileInputStream(FileName));
            p.put("date", new Date().toString());
            p.put("name", "Сергей");
            p.put("name.pass", "pass123");
            p.store(new FileOutputStream(FileName), "/* properties updated */");            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void ReadProps() {
        try {
            p.load(new FileInputStream(FileName));
            System.out.println("date = " + p.getProperty("date"));
            System.out.println("name = " + p.getProperty("name"));
            System.out.println("name.pass" + p.getProperty("name.pass"));            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/**
 *
 * @author fedora
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Информация о системе:");
        System.out.println("Версия Java: " + System.getProperty("java.version"));
        System.out.println("Каталог, в который установлена система Java: " + System.getProperty("java.home"));
        System.out.println("Версия ОС: " + System.getProperty("os.name"));
        System.out.println("Архитектура ОС: " + System.getProperty("os.arch"));
        
        Props props = new Props();
        props.WriteProps();
        props.ReadProps();
    }

}
