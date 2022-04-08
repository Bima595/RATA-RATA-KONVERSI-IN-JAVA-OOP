package com.TUGAS2;

import java.util.Scanner;

public class TUGAS2 {
    Scanner mhr = new Scanner(System.in);
    TUGAS2EASY lk = new TUGAS2EASY();
    private int d1;
    private int d2;
    private int ss;
    private int inpt;
    private char plhn;
    private float luas;
    private float kelng;

    public int getD1() {
        return d1;
    }

    public void setD1() {
        this.d1 = mhr.nextInt();
    }

    public int getD2() {
        return d2;
    }

    public void setD2() {
        this.d2 = mhr.nextInt();
    }

    public int getSs() {
        return ss;
    }

    public void setSs() {
        this.ss = mhr.nextInt();
    }

    public char getPlhn() {
        return plhn;
    }

    public void setPlhn() {this.plhn = mhr.next().charAt(0);}

    public int getInpt() {return inpt;}

    public void setInpt() {this.inpt = mhr.nextInt();}

    public void rmsluas() {
        System.out.print("input diagonal 1 mu : ");
        setD1();
        System.out.print("input diagonal 2 mu : ");
        setD2();
        float luas = (getD1() * getD2() * 1 / 2);
        System.out.print("hasil nya :" + luas);
    }

    public void rmskeliling() {
        System.out.print("input sisi kamu : ");
        setSs();
        float kelng = (getSs() * 4);
        System.out.print("hasil nya :" + kelng);
    }
    public void ext() {
        System.out.println("TERIMA KASIH TELAH MENGGUNAKAN PROGRAM KAMI T^T");
    }

    public void menu() {
        System.out.println("pilihan : \n1.Keliling Ketupat\n2.Luas Ketupat\n3.Konversi Bulan ke hari,jam,menit dan detik\n4.Exit ");
        System.out.print("no : ");
        setPlhn();
        switch (getPlhn()) {
            case '1':
                rmsluas();
                System.out.println("Mau balik ke awal ? ");
                System.out.print("[Y] atau [T]");
                inpt = mhr.next().charAt(0);

                if (inpt == 'y' || inpt == 'Y') {
                    menu();
                }else{
                    ext();
                }
                break;
            case '2':
                rmskeliling();
                System.out.println("Mau balik ke awal ? ");
                System.out.print("[Y] atau [T]");
                inpt = mhr.next().charAt(0);
                if (inpt == 'y' || inpt == 'Y'){
                    menu();
                }else{
                    ext();
                }
                break;

            case '3':
                lk.hitung();
                System.out.println("Mau balik ke awal ? ");
                System.out.print("[Y] atau [T]");
                inpt = mhr.next().charAt(0);
                if (inpt == 'y' || inpt == 'Y'){
                    menu();
                }else{
                    ext();
                }
                break;

            case '4':
            default :
                ext();
                break;

        }
    }
}