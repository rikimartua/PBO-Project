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
        int menu;
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
        System.out.println("Silahkan Pilih : ");
        menu = input.nextInt();
        switch(menu){
            case 1 :
                double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang orbit : ");
                orbit = input.nextInt();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextInt();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextInt();
                TataSurya tMerkurius = new Bumi(jari,orbit,rotasi,revolusi);
                System.out.println("Kecepatan Revolusi = " + tMerkurius.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tMerkurius.kec_rotasi);
                break;
            case 2 :
//                double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang orbit : ");
                orbit = input.nextInt();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextInt();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextInt();
                TataSurya tVenus = new Bumi(jari,orbit,rotasi,revolusi);
                System.out.println("Kecepatan Revolusi = " + tVenus.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tVenus.kec_rotasi);
                break;
            case 3 :
//                double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang orbit : ");
                orbit = input.nextInt();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextInt();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextInt();
                TataSurya tBumi = new Bumi(jari,orbit,rotasi,revolusi);
                System.out.println("Kecepatan Revolusi = " + tBumi.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tBumi.kec_rotasi);
           
                break;
            case 4:
                //double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang orbit : ");
                orbit = input.nextInt();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextInt();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextInt();
                TataSurya tMars = new Bumi(jari,orbit,rotasi,revolusi);
                System.out.println("Kecepatan Revolusi = " + tMars.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tMars.kec_rotasi);
                break;
            case 5 :
                 //double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang orbit : ");
                orbit = input.nextInt();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextInt();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextInt();
                TataSurya tYupiter = new Bumi(jari,orbit,rotasi,revolusi);
                System.out.println("Kecepatan Revolusi = " + tYupiter.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tYupiter.kec_rotasi);
                break;
            case 6 :
                  //double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang orbit : ");
                orbit = input.nextInt();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextInt();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextInt();
                TataSurya tSaturnus = new Bumi(jari,orbit,rotasi,revolusi);
                System.out.println("Kecepatan Revolusi = " + tSaturnus.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tSaturnus.kec_rotasi);
                break;
            case 7 :
                  //double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang orbit : ");
                orbit = input.nextInt();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextInt();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextInt();
                TataSurya tUranus = new Bumi(jari,orbit,rotasi,revolusi);
                System.out.println("Kecepatan Revolusi = " + tUranus.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tUranus.kec_rotasi);
                break;
            case 8 :
                  //double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang orbit : ");
                orbit = input.nextInt();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextInt();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextInt();
                TataSurya tNeptunus = new Bumi(jari,orbit,rotasi,revolusi);
                System.out.println("Kecepatan Revolusi = " + tNeptunus.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tNeptunus.kec_rotasi);
                break;
            case 9 :
                  //double orbit; double rotasi; double revolusi; int jari;
                System.out.println("Input Jari-jari : ");
                jari = input.nextInt();
                System.out.println("Input Panjang orbit : ");
                orbit = input.nextInt();
                System.out.println("Input Kala Rotasi : ");
                rotasi = input.nextInt();
                System.out.println("Input Kala Revolusi : ");
                revolusi = input.nextInt();
                TataSurya tMatahari = new Bumi(jari,orbit,rotasi,revolusi);
                System.out.println("Kecepatan Revolusi = " + tMatahari.kec_revolusi);
                System.out.println("Kecepatan Rotaso = " + tMatahari.kec_rotasi);
                break;    
               
                     
        }
    }
    
}
