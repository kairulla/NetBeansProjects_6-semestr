/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15.pkg1.pkg3.pkgfinal;

/**
 *
 * @author fedora
 */
public class App1 {
    
    public static void main(String[] args) {
        BigDog d1 = new BigDog();
        BigDog d2 = new BigDog("TSN", 100, 26);
        BigDog d3 = new BigDog("TSN", 11, 28);
        
        d3.dog_aging();
        System.out.println(d1.name);
        System.out.println(d1.year);
        System.out.println(d1.weight);
        System.out.println(d2.name);
        System.out.println(d2.year);
        System.out.println(d2.weight);
        System.out.println(d3.name);
        System.out.println(d3.year);
        System.out.println(d3.weight);
        System.out.println("Создано собак: " + d1.count);
        
        Whelp pd = new Whelp();
        System.out.println(pd.name);
        pd.dg.dog_aging();
        System.out.println(pd.bt.name);
        System.out.println(pd.dg.name);
        System.out.println("Создано собак: " + d1.count);
        //pd.in_w = 2;
        pd.setIn_w(2);
        System.out.println(pd.getIn_w());
        //d1 = ("BigDog", 5, 10)
        //d2 = ("TSN", 50, 26)
        //d3 = ("Dog_big_old", 14, 28)
    }
    
}
