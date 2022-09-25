/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15.pkg1.pkg4.pkgfinal;

import java.util.Arrays;
import static java.lang.Math.*;

/**
 *
 * @author fedora
 */
public class TSN01_Calc {
    
    int[] InMass;
    double[] OutMass;
    int length_OrigMass;
    
    public void SetMass(int OrigMass[]) {
        length_OrigMass = OrigMass.length;
        InMass = Arrays.copyOf(OrigMass, length_OrigMass);
        OutMass = new double[length_OrigMass];
    }
    
    public double[] GetMass() {
        int ki, ki1;
        double pr = 1, sum = 0, fk = 1;
        
        for(int i = 0; i < length_OrigMass; i++) {
            try {
                fk *= (i + 1);
                ki = InMass[i];
                pr *= ki;
                sum += ki;
                ki1 = InMass[i - 1];
                OutMass[i] = (sqrt(pow(cos(ki),2) / (fk + sin(pow(ki1, 2)))) * pr) / sum;                
            } catch(Exception ex) {
                OutMass[i] = Double.NaN;
            }
        }
        return OutMass;
    }
    
}
