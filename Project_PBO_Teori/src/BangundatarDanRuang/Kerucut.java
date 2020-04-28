/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangundatarDanRuang;


public class Kerucut extends Lingkaran{

    /*
    r = jari jari alas
    s = garis pelukis
    t = tinggi kerucut
    r1 = jari jari kerucut kecil
    t1 = tinggi kerucut kecil
    */
    public Kerucut(double r) {
        super(r);// jadi dia mengambil r maka super akan merepresentasikan objek dari class induk.
    }
    
     public double luasKerucut(double r, double s){
        double hasilLuasKerucut = Math.PI*r*(s+r);
        if(hasilLuasKerucut == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilLuasKerucut;
    }
    
   public double volumeKerucut(double r, double t){
        double hasilVolumeKerucut = Math.PI*r*r*t/3;
        if(hasilVolumeKerucut == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilVolumeKerucut;
    }
    
    public double luasKerucutPancung(double r1, double r, double t){
        double a = t+Math.pow(r-r1,2);
        double A = Math.sqrt(a);
        double hasilLuasKerucutPancung = Math.PI*A*(r1+r)+Math.PI*(Math.pow(r1, 2)+Math.pow(r,2));
        if(hasilLuasKerucutPancung == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilLuasKerucutPancung;
    }
    
    public double volumeKerucutPancung(double r1, double r, double t1, double t){
        
        double kerucut2 = volumeKerucut(r,t);
        double kerucut1 = volumeKerucut(r1,t1);
        double hasilVolumeKerucutPancung = kerucut2 - kerucut1;
         if(hasilVolumeKerucutPancung == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilVolumeKerucutPancung;
    }
    
}
