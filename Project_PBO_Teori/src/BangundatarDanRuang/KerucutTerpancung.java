
package BangundatarDanRuang;

/**
 *
 * @author HP
 */
public class KerucutTerpancung extends Kerucut{

    public KerucutTerpancung(double r) {
        super(r);
    }
     public double luasKerucutPancung(double r1, double r, double t){
        double a = t+Math.pow(r-r1,2);
        double A = Math.sqrt(a);
        double hasilLuasKerucutPancung = Math.PI*A*(r1+r)+Math.PI*(Math.pow(r1, 2)+Math.pow(r,2));
         if(hasilLuasKerucutPancung  == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilLuasKerucutPancung;
    }
    
    public double volumeKerucutPancung(double r1, double r, double t1, double t){
        
        double kerucut2 = volumeKerucut(r,t);
        double kerucut1 = volumeKerucut(r1,t1);
        double hasilVolumeKerucutPancung = kerucut2 - kerucut1;
          if(hasilVolumeKerucutPancung  == 0){		
			throw new ArithmeticException("Angka pembagi tidak boleh nol!");
		}
        return hasilVolumeKerucutPancung;
    }
    
}
