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
    
    
}
