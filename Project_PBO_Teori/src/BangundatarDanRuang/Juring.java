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
        return hasilBusur;
    }
     public double kelilingJuring(double sudut, double r){
        double busur = panjangBusur(sudut,r);
        double hasilKelilingJuring =busur+2*r;
        return hasilKelilingJuring;
    }
    public double luasJuring(double sudut, double r){
        double bagian = sudut/360;
        double hasilLuasJuring = bagian*getLuas();
        return hasilLuasJuring;
    }
    public double volumeJuring(double r, double t){
        double hasilVolumeJuring = 2*Math.PI*r*r*t;
        return hasilVolumeJuring;
    }
    
    
}
