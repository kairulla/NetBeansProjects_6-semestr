/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14.pkg1.pkg1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author fedora
 */
public class App1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner in = new Scanner(new BufferedReader(new FileReader("/home/ruslan/NetBeansProjects/14-1-1/src/pkg14/pkg1/pkg1/input.txt")));
        PrintWriter out = new PrintWriter(new FileWriter("/home/ruslan/NetBeansProjects/14-1-1/src/pkg14/pkg1/pkg1/output.txt"));
        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a + b);
        in.close();
        out.flush();
        out.close();
    }
}
