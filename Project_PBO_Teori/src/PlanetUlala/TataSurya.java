/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetUlala;

import BangundatarDanRuang.Bola;

/**
 *
 * @author ASUS
 */
public class TataSurya extends Bola {
    protected double kalarotasi;
    protected double kalarevolusi;
    protected double kec_rotasi;
    protected double kec_revolusi;
    protected double orbit;

    public TataSurya(double r, double orbit, double kalarotasi, double kalarevolusi) {
        super(r);
        this.orbit = orbit;
        this.kalarotasi = kalarotasi;
        this.kalarevolusi = kalarevolusi;
        getKecRevolusi();
        getKecRotasi();
    }
    
    public void getKecRotasi(){
        kec_rotasi = super.Keliling() / kalarotasi;
    }
    public void getKecRevolusi(){
        kec_revolusi = orbit * Math.pow(10,6) / kalarevolusi;
    }
    
}
