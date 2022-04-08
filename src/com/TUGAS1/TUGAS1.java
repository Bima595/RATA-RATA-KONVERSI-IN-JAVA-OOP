package com.TUGAS1;

import java.util.Scanner;

public class TUGAS1 {
    Scanner in = new Scanner(System.in);
    private int progdas;
    private int kalkulus;
    private int orkom;
    private double hasil;

    public int getProgdas() {
        return progdas;
    }

    public void setProgdas() {
        this.progdas = in.nextInt();
    }

    public int getKalkulus() {
        return kalkulus;
    }

    public void setKalkulus() {
        this.kalkulus = in.nextInt();
    }

    public int getOrkom() {
        return orkom;
    }

    public void setOrkom() {
        this.orkom = in.nextInt();
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        TUGAS1 obj = new TUGAS1();
        //INPUTAN
        System.out.print("Nilai Progdas : ");
        obj.setProgdas();

        System.out.print("nilai kalkulus :");
        obj.setKalkulus();

        System.out.print("nilai orkom :");
        obj.setOrkom();


        //HITUNG

        double hasil = (obj.progdas + obj.kalkulus + obj.getOrkom()) / 3;
        System.out.println("");
        System.out.println("");
        System.out.print("rata rata anda : " + hasil);
        System.out.println("");
        if (hasil > 70) {
            System.out.println("status : LULUS ");
        } else {
            System.out.println("status : GAGAL ");
        }
    }
}
