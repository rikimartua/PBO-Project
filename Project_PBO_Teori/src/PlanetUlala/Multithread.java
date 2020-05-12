/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetUlala;

/**
 *
 * @author RIKI MARTUA
 */
public class Multithread extends TataSurya implements Runnable{

    Thread t;
    Double luas, volume;
    public Multithread(double r, double orbit, double kalarotasi, double kalarevolusi,String namaPlanet) {
        super(r, orbit, kalarotasi, kalarevolusi);
    }

    @Override
    public void run() {
  
         try { // non aktif 1000 milli detik    
            System.out.println("Luas "+ " : " + LuasPermukaan());
            System.out.println("Volume "+" : " + volumeBola());
            Thread.sleep(5000); 
       	 }
      	 catch(InterruptedException ie) {
            System.out.println("Terinterupsi");
      	 }
     	 
    }
    public void start(){
        if (t == null){
            t = new Thread(this);
            t.start();
        }
    }    
    
   
}
