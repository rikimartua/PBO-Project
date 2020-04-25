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
public class Tembereng extends Lingkaran{

    public Tembereng(double r) {
        super(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double panjangBusur(double sudut, double r){
        double bagian = sudut/360;
        double hasilBusur = bagian*2*Math.PI*r;
        return hasilBusur;
    }
   
    public double luasTembereng(double sudut, double r){
        double sin = Math.sin(sudut);
        double bagian = sudut/360;
        double hasilLuasTembereng = (bagian*getLuas())-(sin*r*r*0.5);
        return hasilLuasTembereng;
    }
    
    public double kelilingTembereng(double sudut, double r){
        double sin = Math.sin(sudut/2);
        double a= panjangBusur(sudut,r);
        double hasilKelilingTembereng = a+(2*r*sin);
        return hasilKelilingTembereng;
    }
    public double volumeBola(double r) {
        double jari=r*r*r;
        double hasilVolumeBola = (Math.PI*4*jari/3);     
        return hasilVolumeBola;
    }
    
    
   
    
}
