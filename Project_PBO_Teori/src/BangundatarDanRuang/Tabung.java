/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangundatarDanRuang;

/**
 *
 * @author HP
 */
public class Tabung extends Lingkaran{
    
    Double Tinggi;

    public Tabung(Double Tinggi, double r) {
        super(r);
        this.Tinggi = Tinggi;
    }

    public Double getTinggi() {
        return Tinggi;
    }

    public void setTinggi(Double Tinggi) {
        this.Tinggi = Tinggi;
    }
    
    public Double getLuasTabung(){
        
        Double Luas=(4*Math.PI*super.r)+(4*Math.PI*super.r*Tinggi);
           if(Luas == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return Luas;
    }
    public Double getVolumeTabung(){
        
        Double Volume=getLuas()*Tinggi;
        if(Volume == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return Volume;
    }
    
    
}
