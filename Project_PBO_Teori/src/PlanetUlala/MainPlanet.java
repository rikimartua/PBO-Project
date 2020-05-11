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
        System.out.println("Silahkan Pilih : ");
        menu = input.nextInt();
        switch(menu){
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                double orbit; double rotasi; double revolusi; int jari;
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
                break;
            case 5 :
                break;
            case 6 :
                break;
            case 7 :
                break;
            case 8 :
                break;
                
               
                     
        }
    }
    
}
