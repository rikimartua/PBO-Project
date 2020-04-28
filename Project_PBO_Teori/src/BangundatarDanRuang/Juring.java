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
public class Juring extends Lingkaran{

    public Juring(double r) {
        super(r);
    }
    
     public double panjangBusur(double sudut, double r){
        double bagian = sudut/360;
        double hasilBusur = bagian*2*Math.PI*r;
        if(hasilBusur == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
         return hasilBusur;
    }
     public double kelilingJuring(double sudut, double r){
        double busur = panjangBusur(sudut,r);
        double hasilKelilingJuring =busur+2*r;
        if(hasilKelilingJuring == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilKelilingJuring;
    }
    public double luasJuring(double sudut, double r){
        double bagian = sudut/360;
        double hasilLuasJuring = bagian*getLuas();
        if(hasilLuasJuring == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilLuasJuring;
    }
    public double volumeJuring(double r, double t){
        double hasilVolumeJuring = 2*Math.PI*r*r*t;
        if(hasilVolumeJuring == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilVolumeJuring;
    }
    
      
}
