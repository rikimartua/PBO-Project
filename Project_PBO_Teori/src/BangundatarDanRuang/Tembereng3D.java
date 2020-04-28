
package BangundatarDanRuang;

/**
 *
 * @author HP
 */
public class Tembereng3D extends Tembereng {

    double t;

    public Tembereng3D(double r, double t) {
        super(r);
        this.t = t;
    }

    public double VolumeTembereng3D(double r, double t) {
        double jari = r * r * r;
        //double hasilVolumeBola = (Math.PI * 4 * jari / 3);
        double tinggi = t * t;
        double hasilVolumeTembereng = (volumeBola(r) - ((Math.PI * tinggi) / 3) * (3 * r - t));
          if(hasilVolumeTembereng  == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilVolumeTembereng;
    }
    public double LuasTembereng3D(double r, double t) {
        double jari = r * r * r;
        //double hasilVolumeBola = (Math.PI * 4 * jari / 3);
        double tinggi = t * t;
        double hasilLuasTembereng = 2*Math.PI*r*t;
         if(hasilLuasTembereng  == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilLuasTembereng;
    }

}
