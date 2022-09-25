/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg1.pkg3.pkg2;

import java.util.ArrayList;

/**
 *
 * @author fedora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> pozdr = new ArrayList<>();
        ArrayList<String> fam = new ArrayList<>();

        pozdr.add("Удачи");
        pozdr.add("Здоровья");
        pozdr.add("Денег");
        fam.add("Петров");
        fam.add("Сидоров");
        fam.add("Иванов");

        if (fam.size() > pozdr.size()) {
            return;
        }

        for (int i = 0; i < fam.size(); i++) {
            int p = (int) Math.floor(Math.random() * pozdr.size());
            System.out.println("Уважаемый " + fam.get(i) + "! Поздравляем Вас с этим прекрасным праздником, и желаем Вам " + pozdr.get(p).toString().toLowerCase() + "!");
            pozdr.remove(p);
        }
    }
}
