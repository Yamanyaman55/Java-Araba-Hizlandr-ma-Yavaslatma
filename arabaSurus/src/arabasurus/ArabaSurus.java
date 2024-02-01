/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arabasurus;

/**
 *
 * @author EXCALIBUR
 */
public class ArabaSurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Araba araba = new Araba("Audi",1995,85,63);
        int k=araba.hızArt( 25);//85+25=110
        araba.hızYav(k, 10);//100
        araba.yazdir();
        araba.arabaOyna(araba);
        araba.yazdir();
    }
    
 
    
    
}
