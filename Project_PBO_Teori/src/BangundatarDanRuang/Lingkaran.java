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
public class Lingkaran implements Datar{

    double r; 

    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    
    @Override
    public double getLuas() {
       double luas= Math.PI * r * r;
       return luas;
    }
 
    
}
