package pbo1.pkg10118033.latihan59;

import java.util.Scanner;

public abstract class Menu {
    protected String nama, bio ;
    protected int id;

    public Menu() {
        System.out.println("=====Detective Conan=====");
        System.out.println("1.) Karakter Detective Conan");
        System.out.println("2.) Karakter Detektif");
        System.out.println("3.) Karakter Anak-anak");
        System.out.println("4.) Karakter yang memiliki persamaan");
        System.out.println("-------------------------");
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    public String getBio() {
        return bio;
    }
       
    public int pilihan(){
        System.out.print("Masukkan pilihan anda = ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    public abstract void tampilProfil();
}