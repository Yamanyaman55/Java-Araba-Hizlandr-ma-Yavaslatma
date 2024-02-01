/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arabasurus;

/**
 *
 * @author EXCALIBUR
 */
public class Araba {
    String marka;
    int model;
    int hız;
    int yas;

    public Araba(String marka, int model, int hız, int yas) {
        this.marka = marka;
        this.model = model;
        this.hız = hız;
        this.yas = yas;
    }
    public int hızArt (int hizlan){
        hız +=hizlan;
        return hız;
        
    }
    public int hızYav(int hiz, int yavaslan){
        hız -=yavaslan;
        return hız;
    }
    public void yazdir(){
        System.out.println("Marka:"+marka+"Model:"+model+"Hiz:"+hız+"yas:"+yas);
        
    }
    
    
    public void arabaOyna(Araba araba){
        araba.hızArt(50);
       
    }
    
}
