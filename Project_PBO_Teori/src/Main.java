
import BangundatarDanRuang.Juring;
import BangundatarDanRuang.Kerucut;
import BangundatarDanRuang.KerucutTerpancung;
import BangundatarDanRuang.Lingkaran;
import BangundatarDanRuang.Tabung;
import BangundatarDanRuang.Tembereng;
import BangundatarDanRuang.Tembereng3D;
import java.awt.Component;
import java.util.InputMismatchException;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class Main {

    private static Component rootPane;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        double jari,jari2,Tinggi ,s,Tinggi2;
        int menu;
        Double Sudut;
        char kembali,menu2,menu3;
        do {
             try{
            System.out.print("Masukkan Jari-jari : ");    
            jari=input.nextDouble();
            Lingkaran lingkaran=new Lingkaran(jari);
            System.out.println("Luas Lingkaran = "+lingkaran.getLuas());
          
            System.out.println(":::::MENU:::::");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.print("Silahkan Pilih : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("\n:::::Bangun Datar:::::");
                    System.out.println("\n:::::LEVEL 2:::::");
                    System.out.println("1. Tembereng 2D");
                    System.out.println("2. Juring 2D");
                    System.out.println("3. Busur");
                    System.out.print("Silahkan Pilih : ");
                    menu2=input.next().charAt(0);
                    switch(menu2){
                        
                        case '1':
                            System.out.print("Masukkan Besar sudut : ");   
                            Sudut=input.nextDouble();
                            System.out.print("Masukkan Jarak Pusat : ");
                            double jarakpusat = input.nextDouble();
                            Tembereng tembereng=new Tembereng(jari);
                            System.out.println("\n====TEMBERENG 2D=====");
                            System.out.println("Panjang Busur = "+tembereng.panjangBusur(Sudut, jari));
                            System.out.println("Luas          = "+tembereng.luasTembereng(Sudut, jari));
                            System.out.println("Keliling      = "+tembereng.kelilingTembereng(Sudut, jari));
                            System.out.println("\n:::::Bangun Ruang:::::");
                            System.out.println(":::::LEVEL 3:::::");
                            System.out.println("====TEMBERENG 3D=====");
                            Tembereng3D tembereng3 = new Tembereng3D(jari, jarakpusat);
                            System.out.println("Luas Permukaan = " + tembereng3.LuasTembereng3D(jari, jarakpusat));
                            System.out.println("Volume         = " + tembereng3.VolumeTembereng3D(jari, jarakpusat));
                            break;
                        case '2':
                            System.out.print("Masukkan Besar sudut : ");   
                            Sudut=input.nextDouble();
                            Juring juring=new Juring(jari);
                            System.out.println("\n====JURING 2D=====");
                            System.out.println("Panjang Busur = "+juring.panjangBusur(Sudut, jari));
                            System.out.println("Luas          = "+juring.luasJuring(Sudut, jari));
                            System.out.println("Keliling      = "+juring.kelilingJuring(Sudut, jari));
                            System.out.println("\n:::::Bangun Ruang:::::");
                            System.out.println(":::::LEVEL 3:::::");
                            System.out.println("====JURING 3D=====");
                            System.out.print("Masukkan Tinggi  : ");   
                            Tinggi=input.nextDouble();
                            System.out.println("Luas Permukaan = "+juring.luasJuring(Sudut, jari));
                            System.out.println("Volume         = "+juring.volumeJuring(jari, Tinggi));
                            break;
                        case '3':
                            System.out.print("Masukkan Besar sudut : ");   
                            Sudut=input.nextDouble();
                            Juring juring1=new Juring(jari);
                            Tembereng tembereng1=new Tembereng(jari);
                            System.out.println("\n====BUSUR=====");
                            System.out.println("Panjang Busur Tembereng = "+tembereng1.panjangBusur(Sudut, jari));
                            System.out.println("Panjang Busur Juring    = "+juring1.panjangBusur(Sudut, jari));
                            break;
                      
                    }
                    break;
                case 2:
                    System.out.println("\n:::::Bangun Ruang:::::");
                    System.out.println("1. Bola");
                    System.out.println("2. Kerucut");
                    System.out.println("3. Tabung");
                    menu3=input.next().charAt(0);
                    switch(menu3){
                        case '1':
                            Tembereng t=new Tembereng(jari);
                            System.out.println("\n====BOLA=====");
                            System.out.println("Volume     = "+t.volumeBola(jari));
                            
                            break;
                        case '2':
                            System.out.print("Masukkan Garis Pelukis  : ");
                            s=input.nextDouble();
                            System.out.print("Masukkan Tinggi Kerucut  : ");   
                            Tinggi=input.nextDouble();
                            
                            Kerucut kerucut=new Kerucut(jari);
                            System.out.println("\n:::::LEVEL 2:::::");
                            System.out.println("\n====KERUCUT=====");
                            System.out.println("Luas Permukaan = "+kerucut.luasKerucut(jari, s));
                            System.out.println("Volume Kerucut = "+kerucut.volumeKerucut(jari, Tinggi));
                            System.out.println("\n\n:::::Bangun Ruang:::::");
                            System.out.println("\n:::::LEVEL 3:::::");
                            System.out.println("\n====KERUCUT TERPANCUNG=====");
                            KerucutTerpancung ke=new KerucutTerpancung(jari);
                            System.out.print("Masukkan Tinggi jari Kecil : ");   
                            jari2=input.nextDouble();
                            System.out.print("Masukkan Tinggi Kerucut Kecil : ");   
                            Tinggi2=input.nextDouble();
                            System.out.println("Luas Permukaan = "+ke.luasKerucutPancung(jari2, jari, Tinggi));
                            System.out.println("Volume         = "+ke.volumeKerucutPancung(jari2, jari, Tinggi2, Tinggi));
                            break;
                        case '3':
                            System.out.print("Masukkan Tinggi : ");    
                            Tinggi=input.nextDouble();
                            Tabung tabung=new Tabung(Tinggi,jari);
                            tabung.setTinggi(Tinggi);
                            System.out.println("Luas Permukaan = "+tabung.getLuasTabung());
                            System.out.println("Volume         = "+tabung.getVolumeTabung());
                            break;
                        
                    }
                    break;
            }
             
                }catch (InputMismatchException e){
                    System.err.println("Input berupa angka Tidak Boleh Huruf!");
                  input.nextLine();
                }catch(ArithmeticException exception){
                    System.out.println("Exception: Suatu integer "
						+ "tidak dapat dibagi oleh nol!");
                    input.nextLine();
               }  catch(Exception er){
                    System.out.println("Hasil UnDefine dengan nilai 0");
                    input.nextLine();
               }  
            
            
            System.out.print("Kembali ke menu? <y|n> : ");
            kembali = input.next().charAt(0);
            
        } while (kembali == 'y' || kembali == 'Y');

       
        
    }
}
