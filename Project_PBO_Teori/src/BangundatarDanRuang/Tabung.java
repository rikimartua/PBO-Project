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
        return Luas;
    }
    public Double getVolumeTabung(){
        
        Double Volume=getLuas()*Tinggi;
        return Volume;
    }
    
    
}
