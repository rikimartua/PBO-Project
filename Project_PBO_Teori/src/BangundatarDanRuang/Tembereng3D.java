/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangundatarDanRuang;

/**
 *
 * @author ASUS
 */
public class Tembereng3D extends Tembereng {

    double t;

    public Tembereng3D(double r, double t) {
        super(r);
        this.t = t;
    }

    public double VolumeTembereng3D(double r, double t) {
        double jari = r * r * r;
        double hasilVolumeBola = (Math.PI * 4 * jari / 3);
        double tinggi = t * t;
        double hasilVolumeTembereng = (hasilVolumeBola - ((Math.PI * tinggi) / 3) * (3 * r - t));
        return hasilVolumeTembereng;
    }

}
