package com.TUGAS2;
import java.util.Scanner;
public class TUGAS2EASY {
    Scanner ez = new Scanner(System.in);
    private int jam;
    private int detik;
    private int menit;
    private int bulan;
    private int hari;

    public void hitung(){
        System.out.print("inputkan waktu (bulan): ");
        bulan = ez.nextInt();

        hari = bulan*30;
        jam = hari*24;
        menit = jam*60;
        detik = menit*60;

        System.out.println("jadi hasil konversi : ");
        System.out.println("hari  : " +hari);
        System.out.println("detik : " +detik);
        System.out.println("menit : " +menit);
        System.out.println("jam   : " +jam);
    }
}
