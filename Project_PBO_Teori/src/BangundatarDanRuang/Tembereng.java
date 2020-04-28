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
public class Tembereng extends Lingkaran{

    public Tembereng(double r) {
        super(r);
    }

    @Override
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double panjangBusur(double sudut, double r){
        double bagian = sudut/360;
        double hasilBusur = bagian*2*Math.PI*r;
        if(hasilBusur== 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilBusur;
    }
   
    public double luasTembereng(double sudut, double r){
        double sin = Math.sin(sudut);
        double bagian = sudut/360;
        double hasilLuasTembereng = (bagian*getLuas())-(sin*r*r*0.5);
         if(hasilLuasTembereng == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilLuasTembereng;
    }
    
    public double kelilingTembereng(double sudut, double r){
        double sin = Math.sin(sudut/2);
        double a= panjangBusur(sudut,r);
        double hasilKelilingTembereng = a+(2*r*sin);
        if(hasilKelilingTembereng  == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilKelilingTembereng;
    }
    public double volumeBola(double r) {
        double jari=r*r*r;
        double hasilVolumeBola = (Math.PI*4*jari/3);     
         if(hasilVolumeBola  == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilVolumeBola;
    }
    
    
   
    
}

