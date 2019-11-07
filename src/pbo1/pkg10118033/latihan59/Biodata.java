package pbo1.pkg10118033.latihan59;

public class Biodata extends Menu {
    @Override
    public int pilihan() {
        return super.pilihan();
    }
    
    @Override
    public void tampilProfil(){
        System.out.println("\n======Biodata Karakter======");
        System.out.println("----------------------------");
        System.out.println("Nama\t: " +getNama());
        System.out.println("Biodata\t: " +getBio());
    }
}