/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14.pkg1.pkg2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author fedora
 */
public class App1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            String dir = new File(".").getAbsoluteFile().getParentFile().getAbsolutePath() + System.getProperty("file.separator");
            Scanner in = new Scanner(new FileInputStream(dir + "input.txt"));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(dir + "output.txt")));            
            
            int s = 0;            
            while (in.hasNextInt()) {
                s += in.nextInt();
            }
            
            out.println(s);
            System.out.println("sum = " + s);
            out.flush();
            out.close();
            in.close();
        } catch (Exception e) {
            System.out.println("Error ...");
        }
    }
    
}
