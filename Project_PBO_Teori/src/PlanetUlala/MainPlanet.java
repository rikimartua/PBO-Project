/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetUlala;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainPlanet {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double[] jari = new Double[8];
        Double[] orbit = new Double[8];
        Double[] rotasi = new Double[8];
        Double[] revolusi = new Double[8];
        char kembali;
        int menu;
        do {
        
        System.out.println("Pilih Planet : ");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Bumi");
        System.out.println("4. Mars");
        System.out.println("5. Yupiter");
        System.out.println("6. Saturnus");
        System.out.println("7. Neptunus");
        System.out.println("8. Uranus");
        System.out.println("9. Matahari");
        System.out.println("10.Thread");
        System.out.println("Silahkan Pilih : ");
        menu = input.nextInt();
        switch(menu){
            case 1 :
               
                System.out.println("Input Jari-jari : ");
                jari[0] = input.nextDouble();
                System.out.println("Input Panjang orbit : ");
                orbit[0] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi[0]= input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi[0] = input.nextDouble();
                TataSurya tMerkurius = new Bumi(jari[0],orbit[0],rotasi[0],revolusi[0]);
                System.out.println("Kecepatan Revolusi = " + tMerkurius.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tMerkurius.kec_rotasi);
                break;
            case 2 :
//                double orbit; double rotasi; double revolusi; int jari;
                 System.out.println("Input Jari-jari : ");
                jari[1] = input.nextDouble();
                System.out.println("Input Panjang orbit : ");
                orbit[1] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi[1]= input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi[1] = input.nextDouble();
                TataSurya tVenus = new Venus(jari[1],orbit[1],rotasi[1],revolusi[1]);
                System.out.println("Kecepatan Revolusi = " + tVenus.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tVenus.kec_rotasi);
                break;
            case 3 :
//                double orbit; double rotasi; double revolusi; int jari;
                 System.out.println("Input Jari-jari : ");
                jari[2] = input.nextDouble();
                System.out.println("Input Panjang orbit : ");
                orbit[2] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi[2]= input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi[2] = input.nextDouble();
                TataSurya tBumi = new Bumi(jari[2],orbit[2],rotasi[2],revolusi[2]);
                System.out.println("Kecepatan Revolusi = " + tBumi.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tBumi.kec_rotasi);
           
                break;
            case 4:
                //double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari[3] = input.nextDouble();
                System.out.println("Input Panjang orbit : ");
                orbit[3] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi[3]= input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi[3] = input.nextDouble();
                TataSurya tMars = new Bumi(jari[3],orbit[3],rotasi[3],revolusi[3]);
                System.out.println("Kecepatan Revolusi = " + tMars.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tMars.kec_rotasi);
                break;
            case 5 :
                 //double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari[4] = input.nextDouble();
                System.out.println("Input Panjang orbit : ");
                orbit[4] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi[4]= input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi[4] = input.nextDouble();
                TataSurya tYupiter = new Bumi(jari[4],orbit[4],rotasi[4],revolusi[4]);
                System.out.println("Kecepatan Revolusi = " + tYupiter.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tYupiter.kec_rotasi);
                break;
            case 6 :
                  //double orbit; double rotasi; double revolusi; int jari;
                 System.out.println("Input Jari-jari : ");
                jari[5] = input.nextDouble();
                System.out.println("Input Panjang orbit : ");
                orbit[5] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi[5]= input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi[5] = input.nextDouble();
                TataSurya tSaturnus = new Bumi(jari[5],orbit[5],rotasi[5],revolusi[5]);
                System.out.println("Kecepatan Revolusi = " + tSaturnus.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tSaturnus.kec_rotasi);
                break;
            case 7 :
                  //double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari[6] = input.nextDouble();
                System.out.println("Input Panjang orbit : ");
                orbit[6] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi[6]= input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi[6] = input.nextDouble();
                TataSurya tUranus = new Uranus(jari[6],orbit[6],rotasi[6],revolusi[6]);
                System.out.println("Kecepatan Revolusi = " + tUranus.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tUranus.kec_rotasi);
                break;
            case 8 :
                  //double orbit; double rotasi; double revolusi; int jari;
                 System.out.println("Input Jari-jari : ");
                jari[7] = input.nextDouble();
                System.out.println("Input Panjang orbit : ");
                orbit[7] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi[7]= input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi[7] = input.nextDouble();
                TataSurya tNeptunus = new Bumi(jari[7],orbit[7],rotasi[7],revolusi[7]);
                System.out.println("Volume = " + tNeptunus.kec_revolusi);
                System.out.println("Luas Permukaan = " + tNeptunus.kec_revolusi);
                System.out.println("Kecepatan Revolusi = " + tNeptunus.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tNeptunus.kec_rotasi);
                break;
            case 9 :
                  //double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari[8] = input.nextDouble();
                System.out.println("Input Panjang orbit : ");
                jari[8] = input.nextDouble();
                System.out.println("Input Kala Rotasi : ");
                rotasi[8]= input.nextDouble();
                System.out.println("Input Kala Revolusi : ");
                revolusi[8] = input.nextDouble();
                TataSurya tMatahari = new Bumi(jari[8],orbit[8],rotasi[8],revolusi[8]);
                System.out.println("Kecepatan Revolusi = " + tMatahari.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + 0);
                break; 
             case 10:
                 try {
                     
                boolean selesai = true;
                for (int i = 0; i <=8; i++) {
                    if (jari[i] == null) {
                        System.out.println("Data Menu ke-"+ i+1 +" Masih Kosong");
                        selesai = false;
                    }
                }
                if(selesai){
                     Thread pMerkurius = new Thread((Runnable)new Merkurius(jari[0],jari[0],rotasi[0],revolusi[0]));
                    Thread pVenus= new Thread((Runnable)new Merkurius(jari[1],jari[1],rotasi[1],revolusi[1]));
                    Thread pBumi = new Thread((Runnable)new Merkurius(jari[2],jari[2],rotasi[2],revolusi[2]));
                    Thread pMars = new Thread((Runnable)new Merkurius(jari[3],jari[3],rotasi[3],revolusi[3]));
                    Thread pJupiter = new Thread((Runnable)new Merkurius(jari[4],jari[4],rotasi[4],revolusi[4]));
                    Thread pSaturnus = new Thread((Runnable)new Merkurius(jari[5],jari[5],rotasi[5],revolusi[5]));
                    Thread pUranus = new Thread((Runnable)new Merkurius(jari[6],jari[6],rotasi[6],revolusi[6]));
                    Thread pNeptunus = new Thread((Runnable)new Merkurius(jari[7],jari[7],rotasi[7],revolusi[7]));
                    Thread pMatahari = new Thread((Runnable)new Merkurius(jari[8],jari[8],rotasi[8],revolusi[8]));

                    pMerkurius.start();
                    pVenus.start();
                    pBumi.start();
                    pMars.start();
                    pJupiter.start();
                    pSaturnus.start();
                    pUranus.start();
                    pNeptunus.start();
                    pMatahari.start();
                    
                }
                } catch (Exception e) {
                     System.err.println("Data belum Di masukkan Semua");
                 }
                break;
               
                     
        }
             System.out.print("Kembali ke menu? <y|n> : ");
            kembali = input.next().charAt(0);
            
        } while (kembali == 'y' || kembali == 'Y');
    }
    
}

