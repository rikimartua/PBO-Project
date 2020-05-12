/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangundatarDanRuang;

/**
 *
 * @author RIKI MARTUA
 */
public class Bola extends Lingkaran{

    public Bola(double r) {
        super(r);
    }
    
     public double volumeBola(double r) {
        double jari=Math.pow(super.r, 3);
        double hasilVolumeBola = (4*Math.PI*jari/3);     
         if(hasilVolumeBola  == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilVolumeBola;
    }
   public double LuasPermukaan(){
        
       double LuasPermukaan=4*getLuas();
       return LuasPermukaan;
    }
    
}
